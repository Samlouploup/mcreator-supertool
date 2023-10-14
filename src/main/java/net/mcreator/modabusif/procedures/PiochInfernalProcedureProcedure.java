package net.mcreator.modabusif.procedures;

import net.minecraft.world.entity.Entity;

public class PiochInfernalProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(4);
	}
}
