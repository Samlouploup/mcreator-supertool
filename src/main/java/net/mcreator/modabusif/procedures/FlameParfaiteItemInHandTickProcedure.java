package net.mcreator.modabusif.procedures;

import net.minecraft.world.entity.Entity;

public class FlameParfaiteItemInHandTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(2);
	}
}
