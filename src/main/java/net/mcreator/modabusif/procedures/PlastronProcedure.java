package net.mcreator.modabusif.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.modabusif.init.ModsupertoolModItems;

public class PlastronProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(ModsupertoolModItems.TERRE_CHESTPLATE.get());
			_setstack.setCount(8);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
