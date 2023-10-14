
package net.mcreator.modabusif.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.Packet;

import net.mcreator.modabusif.init.ModsupertoolModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class GardienDuTempleEntityProjectile extends AbstractArrow implements ItemSupplier {
	public GardienDuTempleEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(ModsupertoolModEntities.GARDIEN_DU_TEMPLE_PROJECTILE.get(), world);
	}

	public GardienDuTempleEntityProjectile(EntityType<? extends GardienDuTempleEntityProjectile> type, Level world) {
		super(type, world);
	}

	public GardienDuTempleEntityProjectile(EntityType<? extends GardienDuTempleEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public GardienDuTempleEntityProjectile(EntityType<? extends GardienDuTempleEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Items.BLAZE_POWDER);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Items.BLAZE_POWDER);
	}
}
