
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modabusif.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.modabusif.entity.PharaonMauditEntity;
import net.mcreator.modabusif.entity.GolemCorompuEntity;
import net.mcreator.modabusif.entity.GardienDuTempleEntityProjectile;
import net.mcreator.modabusif.entity.GardienDuTempleEntity;
import net.mcreator.modabusif.ModsupertoolMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModsupertoolModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ModsupertoolMod.MODID);
	public static final RegistryObject<EntityType<PharaonMauditEntity>> PHARAON_MAUDIT = register("pharaon_maudit", EntityType.Builder.<PharaonMauditEntity>of(PharaonMauditEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PharaonMauditEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GolemCorompuEntity>> GOLEM_COROMPU = register("golem_corompu",
			EntityType.Builder.<GolemCorompuEntity>of(GolemCorompuEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GolemCorompuEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GardienDuTempleEntity>> GARDIEN_DU_TEMPLE = register("gardien_du_temple", EntityType.Builder.<GardienDuTempleEntity>of(GardienDuTempleEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GardienDuTempleEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GardienDuTempleEntityProjectile>> GARDIEN_DU_TEMPLE_PROJECTILE = register("projectile_gardien_du_temple",
			EntityType.Builder.<GardienDuTempleEntityProjectile>of(GardienDuTempleEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(GardienDuTempleEntityProjectile::new).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PharaonMauditEntity.init();
			GolemCorompuEntity.init();
			GardienDuTempleEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PHARAON_MAUDIT.get(), PharaonMauditEntity.createAttributes().build());
		event.put(GOLEM_COROMPU.get(), GolemCorompuEntity.createAttributes().build());
		event.put(GARDIEN_DU_TEMPLE.get(), GardienDuTempleEntity.createAttributes().build());
	}
}
