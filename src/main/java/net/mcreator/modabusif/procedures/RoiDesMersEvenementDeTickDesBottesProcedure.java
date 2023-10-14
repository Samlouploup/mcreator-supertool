package net.mcreator.modabusif.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;

import java.util.Map;

public class RoiDesMersEvenementDeTickDesBottesProcedure {
	public static void execute(ItemStack itemstack) {
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
			if (_enchantments.containsKey(Enchantments.DEPTH_STRIDER)) {
				_enchantments.remove(Enchantments.DEPTH_STRIDER);
				EnchantmentHelper.setEnchantments(_enchantments, itemstack);
			}
		}
		(itemstack).enchant(Enchantments.DEPTH_STRIDER, 6);
	}
}
