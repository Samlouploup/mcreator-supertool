package net.mcreator.modabusif.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;

import java.util.Map;

public class PerlePafaiteItemInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
			if (_enchantments.containsKey(Enchantments.VANISHING_CURSE)) {
				_enchantments.remove(Enchantments.VANISHING_CURSE);
				EnchantmentHelper.setEnchantments(_enchantments, itemstack);
			}
		}
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
			if (_enchantments.containsKey(Enchantments.BINDING_CURSE)) {
				_enchantments.remove(Enchantments.BINDING_CURSE);
				EnchantmentHelper.setEnchantments(_enchantments, itemstack);
			}
		}
	}
}
