
package net.mcreator.modabusif.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.modabusif.procedures.FlammeMagiqueLeJoueurTermineDutiliserLitemProcedure;
import net.mcreator.modabusif.init.ModsupertoolModTabs;

public class FlammeMagiqueItem extends Item {
	public FlammeMagiqueItem() {
		super(new Item.Properties().tab(ModsupertoolModTabs.TAB_ITEMS_DIVERS_SUPER_TOOLS).stacksTo(20).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(-10).saturationMod(0f).alwaysEat()

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		FlammeMagiqueLeJoueurTermineDutiliserLitemProcedure.execute(entity);
		return retval;
	}
}
