package net.mcreator.modabusif.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class PiocheDivineBreakBlocProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 25) == 1) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.DIAMOND));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (!entity.isShiftKeyDown()) {
			if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
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
						|| (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.VISUAL, ClipContext.Fluid.NONE, entity))
								.getDirection()) == Direction.SOUTH) {
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
			} else {
				if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.VISUAL, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.DOWN
						|| (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.VISUAL, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.UP) {
					if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x + 1, y, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x - 1, y, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x + 1, y, z + 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x + 1, y, z - 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x - 1, y, z - 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x - 1, y, z + 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x, y, z + 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x, y, z - 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
				} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.VISUAL, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.NORTH
						|| (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.VISUAL, ClipContext.Fluid.NONE, entity))
								.getDirection()) == Direction.SOUTH) {
					if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x + 1, y, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x - 1, y, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x + 1, y + 1, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x + 1, y - 1, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x - 1, y - 1, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x - 1, y + 1, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x, y + 1, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x, y - 1, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
				} else if ((entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.VISUAL, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.WEST
						|| (entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale(5)), ClipContext.Block.VISUAL, ClipContext.Fluid.NONE, entity)).getDirection()) == Direction.EAST) {
					if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x, y, z + 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x, y, z - 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x, y + 1, z + 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x, y - 1, z + 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x, y - 1, z - 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x, y + 1, z - 1);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x, y + 1, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.STONE && !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
						{
							BlockPos _pos = new BlockPos(x, y - 1, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					}
				}
			}
		}
	}
}
