package net.mcreator.modabusif.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

import net.mcreator.modabusif.init.ModsupertoolModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EnchanteOnCraftDesArmuresProcedure {
	@SubscribeEvent
	public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
		execute(event, event.getCrafting());
	}

	public static void execute(ItemStack itemstack) {
		execute(null, itemstack);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack) {
		if (itemstack.getItem() == ModsupertoolModItems.PHARAON_HELMET.get() || itemstack.getItem() == ModsupertoolModItems.PHARAON_LEGGINGS.get() || itemstack.getItem() == ModsupertoolModItems.PHARAON_CHESTPLATE.get()) {
			(itemstack).enchant(Enchantments.ALL_DAMAGE_PROTECTION, 4);
			(itemstack).enchant(Enchantments.BLAST_PROTECTION, 4);
			(itemstack).enchant(Enchantments.FIRE_PROTECTION, 4);
			(itemstack).enchant(Enchantments.PROJECTILE_PROTECTION, 4);
		}
		if (itemstack.getItem() == ModsupertoolModItems.PHARAON_BOOTS.get()) {
			(itemstack).enchant(Enchantments.ALL_DAMAGE_PROTECTION, 4);
			(itemstack).enchant(Enchantments.PROJECTILE_PROTECTION, 4);
			(itemstack).enchant(Enchantments.BLAST_PROTECTION, 4);
			(itemstack).enchant(Enchantments.FIRE_PROTECTION, 4);
			(itemstack).enchant(Enchantments.FALL_PROTECTION, 4);
			(itemstack).enchant(Enchantments.DEPTH_STRIDER, 3);
		}
	}
}
