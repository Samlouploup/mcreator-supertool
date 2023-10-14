
package net.mcreator.modabusif.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.modabusif.init.ModsupertoolModTabs;

public class CisaillesDElectrienItem extends Item {
	public CisaillesDElectrienItem() {
		super(new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS).durability(20).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		ItemStack retval = new ItemStack(this);
		retval.setDamageValue(itemstack.getDamageValue() + 1);
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return ItemStack.EMPTY;
		}
		return retval;
	}

	@Override
	public boolean isRepairable(ItemStack itemstack) {
		return false;
	}
}
