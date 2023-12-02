package net.mcreator.modabusif.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;

public class PiocheEnFerQuandLeBlocEstDetruitAvecLoutilProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!entity.isShiftKeyDown()) {
			if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.VISUAL, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.DOWN
					|| (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.VISUAL, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.UP) {
				SousprocedureProcedure.execute(world, (x + 1), y, z, entity);
				SousprocedureProcedure.execute(world, (x - 1), y, z, entity);
				SousprocedureProcedure.execute(world, (x + 1), y, (z + 1), entity);
				SousprocedureProcedure.execute(world, (x + 1), y, (z - 1), entity);
				SousprocedureProcedure.execute(world, (x - 1), y, (z - 1), entity);
				SousprocedureProcedure.execute(world, (x - 1), y, (z + 1), entity);
				SousprocedureProcedure.execute(world, x, y, (z + 1), entity);
				SousprocedureProcedure.execute(world, x, y, (z - 1), entity);
			} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.VISUAL, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.NORTH
					|| (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.VISUAL, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.SOUTH) {
				SousprocedureProcedure.execute(world, (x + 1), y, z, entity);
				SousprocedureProcedure.execute(world, (x - 1), y, z, entity);
				SousprocedureProcedure.execute(world, (x + 1), (y + 1), z, entity);
				SousprocedureProcedure.execute(world, (x + 1), (y - 1), z, entity);
				SousprocedureProcedure.execute(world, (x - 1), (y - 1), z, entity);
				SousprocedureProcedure.execute(world, (x - 1), (y + 1), z, entity);
				SousprocedureProcedure.execute(world, x, (y + 1), z, entity);
				SousprocedureProcedure.execute(world, x, (y - 1), z, entity);
			} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.VISUAL, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.WEST
					|| (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.VISUAL, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.EAST) {
				SousprocedureProcedure.execute(world, x, (y - 1), z, entity);
				SousprocedureProcedure.execute(world, x, (y + 1), z, entity);
				SousprocedureProcedure.execute(world, x, y, (z + 1), entity);
				SousprocedureProcedure.execute(world, x, y, (z - 1), entity);
				SousprocedureProcedure.execute(world, x, (y + 1), (z + 1), entity);
				SousprocedureProcedure.execute(world, x, (y - 1), (z + 1), entity);
				SousprocedureProcedure.execute(world, x, (y - 1), (z - 1), entity);
				SousprocedureProcedure.execute(world, x, (y + 1), (z - 1), entity);
			}
		}
	}
}
