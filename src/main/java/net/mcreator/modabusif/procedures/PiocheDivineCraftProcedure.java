package net.mcreator.modabusif.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class PiocheDivineCraftProcedure {
	public static void execute(ItemStack itemstack) {
		(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 6);
		(itemstack).enchant(Enchantments.BLOCK_FORTUNE, 6);
	}
}
