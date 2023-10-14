
package net.mcreator.modabusif.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.modabusif.procedures.CanneDuPharaonLorsqueLoutilEstDansLaMainProcedure;
import net.mcreator.modabusif.init.ModsupertoolModTabs;

import java.util.List;

public class CanneDuPharaonItem extends FishingRodItem {
	public CanneDuPharaonItem() {
		super(new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS).durability(0));
	}

	@Override
	public int getEnchantmentValue() {
		return 7;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("donne chance 3"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			CanneDuPharaonLorsqueLoutilEstDansLaMainProcedure.execute(entity);
	}
}
