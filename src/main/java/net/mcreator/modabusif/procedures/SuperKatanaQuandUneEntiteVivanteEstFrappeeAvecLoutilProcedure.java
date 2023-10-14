package net.mcreator.modabusif.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.modabusif.init.ModsupertoolModItems;

public class SuperKatanaQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 300) == 10) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModsupertoolModItems.EARTHERNERGIE_BOOTS.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(ModsupertoolModItems.SUPER_KATANA.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 200) == 7) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModsupertoolModItems.SUPERFER_LEGGINGS.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 200) == 8) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModsupertoolModItems.SUPERFER_HELMET.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 200) == 9) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModsupertoolModItems.SUPERFER_CHESTPLATE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (Mth.nextInt(RandomSource.create(), 1, 50) == 10) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModsupertoolModItems.NATUREL_HELMET.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 50) == 7) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModsupertoolModItems.NATUREL_CHESTPLATE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 50) == 8) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModsupertoolModItems.NATUREL_LEGGINGS.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (Mth.nextInt(RandomSource.create(), 1, 50) == 9) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(ModsupertoolModItems.NATUREL_BOOTS.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
