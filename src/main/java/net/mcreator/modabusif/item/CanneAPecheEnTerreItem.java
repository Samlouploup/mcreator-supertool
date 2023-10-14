
package net.mcreator.modabusif.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.entity.Entity;

import net.mcreator.modabusif.procedures.CanneAPecheEnTerreLorsqueLoutilEstDansLaMainProcedure;
import net.mcreator.modabusif.init.ModsupertoolModTabs;

public class CanneAPecheEnTerreItem extends FishingRodItem {
	public CanneAPecheEnTerreItem() {
		super(new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS).durability(0));
	}

	@Override
	public int getEnchantmentValue() {
		return 0;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			CanneAPecheEnTerreLorsqueLoutilEstDansLaMainProcedure.execute(entity);
	}
}
