
package net.mcreator.modabusif.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.modabusif.procedures.CoeurDeFeuLeJoueurTermineDutiliserLitemProcedure;
import net.mcreator.modabusif.init.ModsupertoolModTabs;
import net.mcreator.modabusif.init.ModsupertoolModItems;

import java.util.List;

public class CoeurDeFeuItem extends Item {
	public CoeurDeFeuItem() {
		super(new Item.Properties().tab(ModsupertoolModTabs.TAB_ITEMS_DIVERS_SUPER_TOOLS).stacksTo(42).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(15).saturationMod(1f)

				.build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("mangeable"));
		list.add(Component.literal("lootable sur le gardien du feu"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = new ItemStack(ModsupertoolModItems.SUPER_POUDRE_DE_BLAZE.get());
		super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CoeurDeFeuLeJoueurTermineDutiliserLitemProcedure.execute(world, x, y, z);
		if (itemstack.isEmpty()) {
			return retval;
		} else {
			if (entity instanceof Player player && !player.getAbilities().instabuild) {
				if (!player.getInventory().add(retval))
					player.drop(retval, false);
			}
			return itemstack;
		}
	}
}
