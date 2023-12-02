package net.mcreator.modabusif.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class CanneparfaiteQuandLobjetEstFabriquefonduProcedure {
	public static void execute(ItemStack itemstack) {
		(itemstack).enchant(Enchantments.FISHING_LUCK, 4);
		(itemstack).enchant(Enchantments.FISHING_SPEED, 1);
	}
}
