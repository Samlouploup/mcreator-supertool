package net.mcreator.modabusif.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;

import java.util.Map;

public class EpeeDivineQuandLobjetEstFabriquefonduProcedure {
	public static void execute(ItemStack itemstack) {
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
			if (_enchantments.containsKey(Enchantments.MOB_LOOTING)) {
				_enchantments.remove(Enchantments.MOB_LOOTING);
				EnchantmentHelper.setEnchantments(_enchantments, itemstack);
			}
		}
		(itemstack).enchant(Enchantments.MOB_LOOTING, 20);
	}
}
