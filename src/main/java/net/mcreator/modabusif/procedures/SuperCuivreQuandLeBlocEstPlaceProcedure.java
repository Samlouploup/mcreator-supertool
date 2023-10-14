package net.mcreator.modabusif.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.modabusif.init.ModsupertoolModItems;
import net.mcreator.modabusif.init.ModsupertoolModBlocks;

public class SuperCuivreQuandLeBlocEstPlaceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ModsupertoolModBlocks.BLOC_CONDUCTEUR.get() && (world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == ModsupertoolModBlocks.SUPER_CUIVRE.get()
				&& (world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == ModsupertoolModBlocks.SUPER_CUIVRE.get() && (world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == ModsupertoolModBlocks.SUPER_CUIVRE.get()
				&& (world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == ModsupertoolModBlocks.SUPER_CUIVRE.get() && (world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == ModsupertoolModBlocks.SUPER_CUIVRE.get()) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 2, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModsupertoolModItems.COEURDOTOMATE.get()));
				entityToSpawn.setPickUpDelay(0);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
