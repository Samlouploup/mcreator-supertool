package net.mcreator.modabusif.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.modabusif.init.ModsupertoolModEntities;
import net.mcreator.modabusif.init.ModsupertoolModBlocks;
import net.mcreator.modabusif.entity.GolemCorompuEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpawnDeGolemProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WITHER_SKELETON_SKULL) {
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ModsupertoolModBlocks.SUPER_FER_B.get()) {
				if ((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == ModsupertoolModBlocks.SUPER_FER_B.get()) {
					if ((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == ModsupertoolModBlocks.SUPER_FER_B.get()) {
						if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == ModsupertoolModBlocks.SUPER_FER_B.get()) {
							world.setBlock(new BlockPos(x + 1, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(new BlockPos(x - 1, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(new BlockPos(x, y - 2, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(new BlockPos(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new GolemCorompuEntity(ModsupertoolModEntities.GOLEM_COROMPU.get(), _level);
								entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == ModsupertoolModBlocks.SUPER_FER_B.get()) {
						if ((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == ModsupertoolModBlocks.SUPER_FER_B.get()) {
							world.setBlock(new BlockPos(x, y - 1, z + 1), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(new BlockPos(x, y - 1, z - 1), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(new BlockPos(x, y - 2, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(new BlockPos(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = new GolemCorompuEntity(ModsupertoolModEntities.GOLEM_COROMPU.get(), _level);
								entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
								if (entityToSpawn instanceof Mob _mobToSpawn)
									_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
								world.addFreshEntity(entityToSpawn);
							}
						}
					}
				}
			}
		}
	}
}
