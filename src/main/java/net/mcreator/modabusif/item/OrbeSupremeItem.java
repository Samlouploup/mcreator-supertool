
package net.mcreator.modabusif.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.modabusif.init.ModsupertoolModTabs;

import java.util.List;

public class OrbeSupremeItem extends Item {
	public OrbeSupremeItem() {
		super(new Item.Properties().tab(ModsupertoolModTabs.TAB_ITEMS_DIVERS_SUPER_TOOLS).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("s'\u00E9change chez l'armurier ma\u00EEtre"));
	}
}
