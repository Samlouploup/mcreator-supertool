package net.mcreator.modabusif.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.modabusif.entity.GardienDuTempleEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class FrappeFireGolemProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof GardienDuTempleEntity) {
			GardienDuTempleQuandLentiteEstBlesseeProcedure.execute(entity, sourceentity);
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("feu").bypassArmor(), 3);
		}
	}
}
