
package net.mcreator.modabusif.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.modabusif.procedures.CanneparfaiteLorsqueLoutilEstDansLaMainProcedure;
import net.mcreator.modabusif.procedures.CanneDivineQuandLobjetEstFabriquefonduProcedure;
import net.mcreator.modabusif.procedures.CanneDivineLorsqueLoutilEstDansLaMainProcedure;
import net.mcreator.modabusif.init.ModsupertoolModTabs;

import java.util.List;

public class CanneDivineItem extends FishingRodItem {
	public CanneDivineItem() {
		super(new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS).durability(0));
	}

	@Override
	public int getEnchantmentValue() {
		return 30;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("seule canne assez solide et chanceuse pour p\u00EAcher un kraken"));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		CanneDivineQuandLobjetEstFabriquefonduProcedure.execute(itemstack);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			CanneDivineLorsqueLoutilEstDansLaMainProcedure.execute(entity);
		CanneparfaiteLorsqueLoutilEstDansLaMainProcedure.execute(entity);
	}
}
