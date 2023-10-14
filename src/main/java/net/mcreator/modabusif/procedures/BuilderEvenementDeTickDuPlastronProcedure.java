package net.mcreator.modabusif.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class BuilderEvenementDeTickDuPlastronProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 60, 30, false, false));
		if (entity instanceof Player _player) {
			_player.getAbilities().invulnerable = (Level.OVERWORLD == (entity.level.dimension()));
			_player.onUpdateAbilities();
		}
	}
}
