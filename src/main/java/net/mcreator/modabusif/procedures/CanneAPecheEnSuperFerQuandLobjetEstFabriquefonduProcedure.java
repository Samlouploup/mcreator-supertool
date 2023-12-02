package net.mcreator.modabusif.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class CanneAPecheEnSuperFerQuandLobjetEstFabriquefonduProcedure {
	public static void execute(ItemStack itemstack) {
		(itemstack).enchant(Enchantments.FISHING_SPEED, 1);
	}
}
