
package net.mcreator.modabusif.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.modabusif.procedures.PiocheenflameprocedureProcedure;
import net.mcreator.modabusif.procedures.PiochebrulanteToolInHandTickProcedure;
import net.mcreator.modabusif.procedures.PiocheEnFerQuandLeBlocEstDetruitAvecLoutilProcedure;
import net.mcreator.modabusif.init.ModsupertoolModTabs;

import java.util.List;

public class PiocheEnflameItem extends PickaxeItem {
	public PiocheEnflameItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return -0.8f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 4;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -3.5f, new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS));
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		PiocheEnFerQuandLeBlocEstDetruitAvecLoutilProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		PiocheenflameprocedureProcedure.execute(entity);
		return retval;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Si chaud que \u00E7a garde tout intact !"));
		list.add(Component.literal("breaking power: 1"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			PiochebrulanteToolInHandTickProcedure.execute(entity, itemstack);
	}
}
