package net.mcreator.modabusif.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;

import java.util.Map;

public class PiocheParfaiteQuandLobjetEstFabriquefonduProcedure {
	public static void execute(ItemStack itemstack) {
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_EFFICIENCY, itemstack) < 3) {
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(Enchantments.BLOCK_EFFICIENCY)) {
					_enchantments.remove(Enchantments.BLOCK_EFFICIENCY);
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
			(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 3);
		}
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, itemstack) < 4) {
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(Enchantments.BLOCK_FORTUNE)) {
					_enchantments.remove(Enchantments.BLOCK_FORTUNE);
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
			(itemstack).enchant(Enchantments.BLOCK_FORTUNE, 4);
		}
	}
}
