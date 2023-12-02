package net.mcreator.modabusif.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.modabusif.network.ModsupertoolModVariables;

public class FlammeMagiqueLeJoueurTermineDutiliserLitemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(ModsupertoolModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ModsupertoolModVariables.PlayerVariables())).magie + 1;
			entity.getCapability(ModsupertoolModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.magie = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal(("magie:" + (entity.getCapability(ModsupertoolModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ModsupertoolModVariables.PlayerVariables())).magie)), false);
		DebugFlyOnCcProcedure.execute(entity);
	}
}
