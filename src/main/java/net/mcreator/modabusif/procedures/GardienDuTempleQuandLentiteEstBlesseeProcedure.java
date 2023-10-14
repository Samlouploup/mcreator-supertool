package net.mcreator.modabusif.procedures;

import net.minecraft.world.entity.Entity;

public class GardienDuTempleQuandLentiteEstBlesseeProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		sourceentity.setSecondsOnFire(15);
		entity.setSecondsOnFire(15);
	}
}
