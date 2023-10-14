package net.mcreator.modabusif.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.modabusif.network.ModsupertoolModVariables;

public class EnderEvenementDeTickDuPlastronProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 60, 1, false, false));
		if (Level.END == (entity.level.dimension())) {
			if (5 <= (entity.getCapability(ModsupertoolModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ModsupertoolModVariables.PlayerVariables())).magie) {
				if (5 >= entity.getY()) {
					{
						Entity _ent = entity;
						_ent.teleportTo(x, (y + 150), z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(x, (y + 150), z, _ent.getYRot(), _ent.getXRot());
					}
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 60, 1, false, false));
				}
			}
		}
	}
}
