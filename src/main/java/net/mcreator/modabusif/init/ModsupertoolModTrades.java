
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.modabusif.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModsupertoolModTrades {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades().add(new BasicItemListing(new ItemStack(ModsupertoolModItems.FLAMME_MAGIQUE.get(), 10),

				new ItemStack(ModsupertoolModItems.FLAME_PARFAITE.get()), 1, 5, 0.05f));
	}

	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.EMERALD_BLOCK, 20), new ItemStack(ModsupertoolModBlocks.SUPER_DIAMANT.get(), 2), new ItemStack(ModsupertoolModItems.ORBE_SUPREME.get()), 2, 3, 0f));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Blocks.ROSE_BUSH), new ItemStack(Blocks.POPPY), new ItemStack(ModsupertoolModItems.AME_MONDE.get()), 3, 10, 0f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(ModsupertoolModItems.VENTRE_DE_TORTUE.get()),

					new ItemStack(Items.EMERALD, 5), 1, 15, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(ModsupertoolModItems.VENTRE_DE_TORTUE.get(), 2), new ItemStack(Items.GREEN_DYE), new ItemStack(Items.EMERALD, 5), 3, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.ENDER_PEARL, 2), new ItemStack(Items.EMERALD), new ItemStack(ModsupertoolModItems.SUPER_OEIL_DE_LEND.get()), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(ModsupertoolModItems.SUPER_OEIL_DE_LEND.get(), 2), new ItemStack(Items.EMERALD), new ItemStack(Items.ENDER_EYE, 3), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(ModsupertoolModItems.CASSE_VIDE.get()), new ItemStack(ModsupertoolModItems.OEIL_DU_WITHER_FOU.get()), new ItemStack(ModsupertoolModItems.PIOCHE_WITHER.get()), 10, 5, 0.05f));
			event.getTrades().get(4)
					.add(new BasicItemListing(new ItemStack(ModsupertoolModItems.FLAME_PARFAITE.get()), new ItemStack(ModsupertoolModItems.SUPER_STAR.get()), new ItemStack(ModsupertoolModItems.OEIL_DU_WITHER_FOU.get()), 1, 10, 0.05f));
		}
	}
}
