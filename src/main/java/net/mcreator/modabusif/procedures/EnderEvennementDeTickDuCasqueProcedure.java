package net.mcreator.modabusif.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.modabusif.network.ModsupertoolModVariables;

public class EnderEvennementDeTickDuCasqueProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 60, 1, false, false));
		if ((entity.getCapability(ModsupertoolModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ModsupertoolModVariables.PlayerVariables())).magie >= 15) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = ((entity.level.dimension()) == Level.END);
				_player.onUpdateAbilities();
			}
		}
	}
}
