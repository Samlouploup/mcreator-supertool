
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modabusif.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.modabusif.client.gui.TmepleDeFeuScreen;
import net.mcreator.modabusif.client.gui.SupremeGuiScreen;
import net.mcreator.modabusif.client.gui.SuperUtilitiesScreen;
import net.mcreator.modabusif.client.gui.SuperTraderScreen;
import net.mcreator.modabusif.client.gui.PresentationDuCodexScreen;
import net.mcreator.modabusif.client.gui.PotiondExpScreen;
import net.mcreator.modabusif.client.gui.PharaonGuiScreen;
import net.mcreator.modabusif.client.gui.ParfaitGuiScreen;
import net.mcreator.modabusif.client.gui.OrigineDuNetherScreen;
import net.mcreator.modabusif.client.gui.OEilDuWitherFouguiScreen;
import net.mcreator.modabusif.client.gui.NaturelGuiScreen;
import net.mcreator.modabusif.client.gui.MagieDeCompactageScreen;
import net.mcreator.modabusif.client.gui.GolemCorompuGuiScreen;
import net.mcreator.modabusif.client.gui.FlammeParfaiteScreen;
import net.mcreator.modabusif.client.gui.FlammeMagiqueGuiScreen;
import net.mcreator.modabusif.client.gui.EntreNetherScreen;
import net.mcreator.modabusif.client.gui.EntreMateriauxScreen;
import net.mcreator.modabusif.client.gui.EntreItemsScreen;
import net.mcreator.modabusif.client.gui.EntreCodexScreen;
import net.mcreator.modabusif.client.gui.EntreAutresScreen;
import net.mcreator.modabusif.client.gui.EarthenergieGuiScreen;
import net.mcreator.modabusif.client.gui.ConducteurScreen;
import net.mcreator.modabusif.client.gui.BouteilleScreen;
import net.mcreator.modabusif.client.gui.ArmureDuMaitreDuNetherGuiScreen;
import net.mcreator.modabusif.client.gui.ArmureDeLendScreen;
import net.mcreator.modabusif.client.gui.AmeMondeGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModsupertoolModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ModsupertoolModMenus.BOUTEILLE.get(), BouteilleScreen::new);
			MenuScreens.register(ModsupertoolModMenus.ENTRE_CODEX.get(), EntreCodexScreen::new);
			MenuScreens.register(ModsupertoolModMenus.ENTRE_AUTRES.get(), EntreAutresScreen::new);
			MenuScreens.register(ModsupertoolModMenus.ENTRE_NETHER.get(), EntreNetherScreen::new);
			MenuScreens.register(ModsupertoolModMenus.ORIGINE_DU_NETHER.get(), OrigineDuNetherScreen::new);
			MenuScreens.register(ModsupertoolModMenus.TMEPLE_DE_FEU.get(), TmepleDeFeuScreen::new);
			MenuScreens.register(ModsupertoolModMenus.FLAMME_PARFAITE.get(), FlammeParfaiteScreen::new);
			MenuScreens.register(ModsupertoolModMenus.ARMURE_DU_MAITRE_DU_NETHER_GUI.get(), ArmureDuMaitreDuNetherGuiScreen::new);
			MenuScreens.register(ModsupertoolModMenus.FLAMME_MAGIQUE_GUI.get(), FlammeMagiqueGuiScreen::new);
			MenuScreens.register(ModsupertoolModMenus.AME_MONDE_GUI.get(), AmeMondeGuiScreen::new);
			MenuScreens.register(ModsupertoolModMenus.ENTRE_ITEMS.get(), EntreItemsScreen::new);
			MenuScreens.register(ModsupertoolModMenus.O_EIL_DU_WITHER_FOUGUI.get(), OEilDuWitherFouguiScreen::new);
			MenuScreens.register(ModsupertoolModMenus.ARMURE_DE_LEND.get(), ArmureDeLendScreen::new);
			MenuScreens.register(ModsupertoolModMenus.PRESENTATION_DU_CODEX.get(), PresentationDuCodexScreen::new);
			MenuScreens.register(ModsupertoolModMenus.SUPER_UTILITIES.get(), SuperUtilitiesScreen::new);
			MenuScreens.register(ModsupertoolModMenus.SUPER_TRADER.get(), SuperTraderScreen::new);
			MenuScreens.register(ModsupertoolModMenus.POTIOND_EXP.get(), PotiondExpScreen::new);
			MenuScreens.register(ModsupertoolModMenus.ENTRE_MATERIAUX.get(), EntreMateriauxScreen::new);
			MenuScreens.register(ModsupertoolModMenus.EARTHENERGIE_GUI.get(), EarthenergieGuiScreen::new);
			MenuScreens.register(ModsupertoolModMenus.PHARAON_GUI.get(), PharaonGuiScreen::new);
			MenuScreens.register(ModsupertoolModMenus.SUPREME_GUI.get(), SupremeGuiScreen::new);
			MenuScreens.register(ModsupertoolModMenus.PARFAIT_GUI.get(), ParfaitGuiScreen::new);
			MenuScreens.register(ModsupertoolModMenus.NATUREL_GUI.get(), NaturelGuiScreen::new);
			MenuScreens.register(ModsupertoolModMenus.CONDUCTEUR.get(), ConducteurScreen::new);
			MenuScreens.register(ModsupertoolModMenus.GOLEM_COROMPU_GUI.get(), GolemCorompuGuiScreen::new);
			MenuScreens.register(ModsupertoolModMenus.MAGIE_DE_COMPACTAGE.get(), MagieDeCompactageScreen::new);
		});
	}
}
