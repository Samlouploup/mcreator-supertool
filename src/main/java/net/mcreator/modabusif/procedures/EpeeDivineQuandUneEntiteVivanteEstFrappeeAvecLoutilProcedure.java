package net.mcreator.modabusif.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class EpeeDivineQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.MAGIC, 5);
	}
}
