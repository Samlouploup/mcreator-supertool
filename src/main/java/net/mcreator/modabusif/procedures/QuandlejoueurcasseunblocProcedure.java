package net.mcreator.modabusif.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.modabusif.init.ModsupertoolModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class QuandlejoueurcasseunblocProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModsupertoolModItems.DECAPITARBRE.get()) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.OAK_LOG) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Blocks.OAK_LOG);
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.BIRCH_LOG) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Blocks.BIRCH_LOG);
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.JUNGLE_LOG) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Blocks.JUNGLE_LOG);
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DARK_OAK_LOG) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Blocks.DARK_OAK_LOG);
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.SPRUCE_LOG) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Blocks.SPRUCE_LOG);
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.ACACIA_LOG) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Blocks.ACACIA_LOG);
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.MANGROVE_LOG) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Blocks.MANGROVE_LOG);
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WARPED_STEM) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Blocks.WARPED_STEM);
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.CRIMSON_STEM) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Blocks.CRIMSON_STEM);
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ModsupertoolModItems.ANTITERREE.get()) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DIRT) {
				if (1 == Mth.nextInt(RandomSource.create(), 1, 10)) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ModsupertoolModItems.TERRE_HELMET.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (3 == Mth.nextInt(RandomSource.create(), 1, 10)) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ModsupertoolModItems.TERRE_CHESTPLATE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (2 == Mth.nextInt(RandomSource.create(), 1, 10)) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ModsupertoolModItems.TERRE_LEGGINGS.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (4 == Mth.nextInt(RandomSource.create(), 1, 10)) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ModsupertoolModItems.TERRE_BOOTS.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (5 == Mth.nextInt(RandomSource.create(), 1, 10)) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ModsupertoolModItems.PIOCHE_EN_TERRE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				if (5 == Mth.nextInt(RandomSource.create(), 1, 10)) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(ModsupertoolModItems.EPEE_EN_TERRE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		}
	}
}
