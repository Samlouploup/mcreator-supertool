package net.mcreator.modabusif.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;

import java.util.Map;

public class PiocheDuPharaonQuandLobjetEstFabriquefonduProcedure {
	public static void execute(ItemStack itemstack) {
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
			if (_enchantments.containsKey(Enchantments.BLOCK_EFFICIENCY)) {
				_enchantments.remove(Enchantments.BLOCK_EFFICIENCY);
				EnchantmentHelper.setEnchantments(_enchantments, itemstack);
			}
		}
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
			if (_enchantments.containsKey(Enchantments.BLOCK_FORTUNE)) {
				_enchantments.remove(Enchantments.BLOCK_FORTUNE);
				EnchantmentHelper.setEnchantments(_enchantments, itemstack);
			}
		}
		(itemstack).enchant(Enchantments.BLOCK_EFFICIENCY, 3);
		(itemstack).enchant(Enchantments.BLOCK_FORTUNE, 4);
	}
}
