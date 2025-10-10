package net.doppelr.lemonmates.item;

import net.doppelr.lemonmates.entity.ModBoatEntity;
import net.doppelr.lemonmates.entity.ModChestBoatEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.dispenser.BlockSource;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

import java.util.List;
import java.util.function.Predicate;

public class ModBoatItem extends Item {
    private static final Predicate<Entity> ENTITY_PREDICATE = EntitySelector.NO_SPECTATORS.and(Entity::isPickable);
    private final ModBoatEntity.Type type;
    private final boolean hasChest;

    public ModBoatItem(boolean hasChest, ModBoatEntity.Type type, Item.Properties properties) {
        super(properties);
        this.hasChest = hasChest;
        this.type = type;
        DispenserBlock.registerBehavior(this, new ModBoatDispenseItemBehavior(this.type, this.hasChest));
    }

    private static class ModBoatDispenseItemBehavior extends DefaultDispenseItemBehavior {
        private final DefaultDispenseItemBehavior defaultDispenseItemBehavior;
        private final ModBoatEntity.Type type;
        private final boolean isChestBoat;

        public ModBoatDispenseItemBehavior(ModBoatEntity.Type type, boolean isChestBoat) {
            this.defaultDispenseItemBehavior = new DefaultDispenseItemBehavior();
            this.type = type;
            this.isChestBoat = isChestBoat;
        }

        public ItemStack execute(BlockSource blockSource, ItemStack item) {
            Direction direction = (Direction)blockSource.state().getValue(DispenserBlock.FACING);
            ServerLevel serverlevel = blockSource.level();
            Vec3 vec3 = blockSource.center();
            double d0 = 0.5625F + EntityType.BOAT.getWidth() / 2.0F;
            double d1 = vec3.x() + direction.getStepX() * d0;
            double d2 = vec3.y() + (direction.getStepY() * 1.125F);
            double d3 = vec3.z() + direction.getStepZ() * d0;
            BlockPos blockpos = blockSource.pos().relative(direction);
            Boat boat;
            if (this.isChestBoat) {
                ModChestBoatEntity modChestBoat = new ModChestBoatEntity(serverlevel, d1, d2, d3);
                modChestBoat.setVariant(this.type);
                boat = modChestBoat;
            } else {
                ModBoatEntity modBoat = new ModBoatEntity(serverlevel, d1, d2, d3);
                modBoat.setVariant(this.type);
                boat = modBoat;
            }
            EntityType.createDefaultStackConfig(serverlevel, item, null).accept(boat);
            boat.setYRot(direction.toYRot());
            double d4;
            if (boat.canBoatInFluid(serverlevel.getFluidState(blockpos))) {
                d4 = 1.0F;
            } else {
                if (!serverlevel.getBlockState(blockpos).isAir() || !boat.canBoatInFluid(serverlevel.getFluidState(blockpos.below()))) {
                    return this.defaultDispenseItemBehavior.dispense(blockSource, item);
                }
                d4 = 0.0F;
            }
            boat.setPos(d1, d2 + d4, d3);
            serverlevel.addFreshEntity(boat);
            item.shrink(1);
            return item;
        }
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        HitResult hitresult = getPlayerPOVHitResult(level, player, ClipContext.Fluid.ANY);
        if (hitresult.getType() == HitResult.Type.MISS) {
            return InteractionResultHolder.pass(itemstack);
        } else {
            Vec3 vec3 = player.getViewVector(1.0F);
            List<Entity> list = level.getEntities(player, player.getBoundingBox().expandTowards(vec3.scale(5.0)).inflate(1.0), ENTITY_PREDICATE);
            if (!list.isEmpty()) {
                Vec3 vec31 = player.getEyePosition();

                for (Entity entity : list) {
                    AABB aabb = entity.getBoundingBox().inflate(entity.getPickRadius());
                    if (aabb.contains(vec31)) {
                        return InteractionResultHolder.pass(itemstack);
                    }
                }
            }

            if (hitresult.getType() == HitResult.Type.BLOCK) {
                Boat boat = getBoat(level, hitresult, itemstack, player);
                if (boat instanceof ModChestBoatEntity chestBoat) {
                    chestBoat.setVariant(type);
                } else if (boat instanceof ModBoatEntity boatEntity) {
                    boatEntity.setVariant(this.type);
                }
                boat.setYRot(player.getYRot());
                if (!level.noCollision(boat, boat.getBoundingBox())) {
                    return InteractionResultHolder.fail(itemstack);
                } else {
                    if (!level.isClientSide) {
                        level.addFreshEntity(boat);
                        level.gameEvent(player, GameEvent.ENTITY_PLACE, hitresult.getLocation());
                        itemstack.consume(1, player);
                    }
                    player.awardStat(Stats.ITEM_USED.get(this));
                    return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
                }
            } else {
                return InteractionResultHolder.pass(itemstack);
            }
        }
    }

    private Boat getBoat(Level level, HitResult hitResult, ItemStack stack, Player player) {
        Vec3 vec3 = hitResult.getLocation();
        Boat boat = this.hasChest ? new ModChestBoatEntity(level, vec3.x, vec3.y, vec3.z) : new ModBoatEntity(level, vec3.x, vec3.y, vec3.z);
        if (level instanceof ServerLevel serverlevel) {
            EntityType.<Boat>createDefaultStackConfig(serverlevel, stack, player).accept(boat);
        }
        return boat;
    }
}
