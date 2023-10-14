
package net.mcreator.modabusif.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.modabusif.init.ModsupertoolModTabs;

public class FilConducteurItem extends Item {
	public FilConducteurItem() {
		super(new Item.Properties().tab(ModsupertoolModTabs.TAB_ITEMS_DIVERS_SUPER_TOOLS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
