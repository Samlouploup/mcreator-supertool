package net.mcreator.modabusif.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class RoiDesMersLeggingsTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWater()) {
			if (entity instanceof Player _player)
				_player.getFoodData().setFoodLevel(19);
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 60, 1, false, false));
		}
	}
}
