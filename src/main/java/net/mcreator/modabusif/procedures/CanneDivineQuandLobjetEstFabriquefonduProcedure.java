package net.mcreator.modabusif.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class CanneDivineQuandLobjetEstFabriquefonduProcedure {
	public static void execute(ItemStack itemstack) {
		(itemstack).enchant(Enchantments.FISHING_LUCK, 6);
		(itemstack).enchant(Enchantments.FISHING_SPEED, 2);
	}
}
