
package net.mcreator.modabusif.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.modabusif.procedures.PainDeViandeMagiqueLorsqueLeJoueurTermineDutiliserLitemProcedure;
import net.mcreator.modabusif.init.ModsupertoolModTabs;

import java.util.List;

public class PainDeViandeMagiqueItem extends Item {
	public PainDeViandeMagiqueItem() {
		super(new Item.Properties().tab(ModsupertoolModTabs.TAB_ITEMS_DIVERS_SUPER_TOOLS).stacksTo(16).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(-40).saturationMod(0f).alwaysEat().meat().build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 64;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Ajoute Beaucoup de magie."));
		list.add(Component.literal("Lent a manger."));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		PainDeViandeMagiqueLorsqueLeJoueurTermineDutiliserLitemProcedure.execute(entity);
		return retval;
	}
}
