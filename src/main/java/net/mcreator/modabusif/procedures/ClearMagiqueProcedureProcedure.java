package net.mcreator.modabusif.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.modabusif.network.ModsupertoolModVariables;

public class ClearMagiqueProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 0;
			entity.getCapability(ModsupertoolModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.magie = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		DebugFlyOnCcProcedure.execute(entity);
	}
}
