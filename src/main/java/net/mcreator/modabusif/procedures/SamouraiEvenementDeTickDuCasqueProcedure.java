package net.mcreator.modabusif.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class SamouraiEvenementDeTickDuCasqueProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (17 <= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 1, false, false));
		}
	}
}
