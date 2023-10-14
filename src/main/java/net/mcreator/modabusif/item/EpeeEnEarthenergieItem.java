
package net.mcreator.modabusif.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.modabusif.procedures.EpeeEnEarthenergieLorsqueLoutilEstDansLaMainProcedure;
import net.mcreator.modabusif.init.ModsupertoolModTabs;

import java.util.List;

public class EpeeEnEarthenergieItem extends SwordItem {
	public EpeeEnEarthenergieItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 2.5f;
			}

			public float getAttackDamageBonus() {
				return 1.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 3;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.REDSTONE_BLOCK), new ItemStack(Blocks.EMERALD_BLOCK));
			}
		}, 3, -2.5f, new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("donne vitesse 2"));
		list.add(Component.literal("donne sauts am\u00E9lior\u00E9s 2"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			EpeeEnEarthenergieLorsqueLoutilEstDansLaMainProcedure.execute(entity);
	}
}
