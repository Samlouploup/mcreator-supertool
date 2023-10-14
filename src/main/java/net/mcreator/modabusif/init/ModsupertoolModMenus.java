
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modabusif.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.modabusif.world.inventory.TmepleDeFeuMenu;
import net.mcreator.modabusif.world.inventory.SupremeGuiMenu;
import net.mcreator.modabusif.world.inventory.SuperUtilitiesMenu;
import net.mcreator.modabusif.world.inventory.SuperTraderMenu;
import net.mcreator.modabusif.world.inventory.PresentationDuCodexMenu;
import net.mcreator.modabusif.world.inventory.PotiondExpMenu;
import net.mcreator.modabusif.world.inventory.PharaonGuiMenu;
import net.mcreator.modabusif.world.inventory.ParfaitGuiMenu;
import net.mcreator.modabusif.world.inventory.OrigineDuNetherMenu;
import net.mcreator.modabusif.world.inventory.OEilDuWitherFouguiMenu;
import net.mcreator.modabusif.world.inventory.NaturelGuiMenu;
import net.mcreator.modabusif.world.inventory.MagieDeCompactageMenu;
import net.mcreator.modabusif.world.inventory.GolemCorompuGuiMenu;
import net.mcreator.modabusif.world.inventory.FlammeParfaiteMenu;
import net.mcreator.modabusif.world.inventory.FlammeMagiqueGuiMenu;
import net.mcreator.modabusif.world.inventory.EntreNetherMenu;
import net.mcreator.modabusif.world.inventory.EntreMateriauxMenu;
import net.mcreator.modabusif.world.inventory.EntreItemsMenu;
import net.mcreator.modabusif.world.inventory.EntreCodexMenu;
import net.mcreator.modabusif.world.inventory.EntreAutresMenu;
import net.mcreator.modabusif.world.inventory.EarthenergieGuiMenu;
import net.mcreator.modabusif.world.inventory.ConducteurMenu;
import net.mcreator.modabusif.world.inventory.BouteilleMenu;
import net.mcreator.modabusif.world.inventory.ArmureDuMaitreDuNetherGuiMenu;
import net.mcreator.modabusif.world.inventory.ArmureDeLendMenu;
import net.mcreator.modabusif.world.inventory.AmeMondeGuiMenu;
import net.mcreator.modabusif.ModsupertoolMod;

public class ModsupertoolModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ModsupertoolMod.MODID);
	public static final RegistryObject<MenuType<BouteilleMenu>> BOUTEILLE = REGISTRY.register("bouteille", () -> IForgeMenuType.create(BouteilleMenu::new));
	public static final RegistryObject<MenuType<EntreCodexMenu>> ENTRE_CODEX = REGISTRY.register("entre_codex", () -> IForgeMenuType.create(EntreCodexMenu::new));
	public static final RegistryObject<MenuType<EntreAutresMenu>> ENTRE_AUTRES = REGISTRY.register("entre_autres", () -> IForgeMenuType.create(EntreAutresMenu::new));
	public static final RegistryObject<MenuType<EntreNetherMenu>> ENTRE_NETHER = REGISTRY.register("entre_nether", () -> IForgeMenuType.create(EntreNetherMenu::new));
	public static final RegistryObject<MenuType<OrigineDuNetherMenu>> ORIGINE_DU_NETHER = REGISTRY.register("origine_du_nether", () -> IForgeMenuType.create(OrigineDuNetherMenu::new));
	public static final RegistryObject<MenuType<TmepleDeFeuMenu>> TMEPLE_DE_FEU = REGISTRY.register("tmeple_de_feu", () -> IForgeMenuType.create(TmepleDeFeuMenu::new));
	public static final RegistryObject<MenuType<FlammeParfaiteMenu>> FLAMME_PARFAITE = REGISTRY.register("flamme_parfaite", () -> IForgeMenuType.create(FlammeParfaiteMenu::new));
	public static final RegistryObject<MenuType<ArmureDuMaitreDuNetherGuiMenu>> ARMURE_DU_MAITRE_DU_NETHER_GUI = REGISTRY.register("armure_du_maitre_du_nether_gui", () -> IForgeMenuType.create(ArmureDuMaitreDuNetherGuiMenu::new));
	public static final RegistryObject<MenuType<FlammeMagiqueGuiMenu>> FLAMME_MAGIQUE_GUI = REGISTRY.register("flamme_magique_gui", () -> IForgeMenuType.create(FlammeMagiqueGuiMenu::new));
	public static final RegistryObject<MenuType<AmeMondeGuiMenu>> AME_MONDE_GUI = REGISTRY.register("ame_monde_gui", () -> IForgeMenuType.create(AmeMondeGuiMenu::new));
	public static final RegistryObject<MenuType<EntreItemsMenu>> ENTRE_ITEMS = REGISTRY.register("entre_items", () -> IForgeMenuType.create(EntreItemsMenu::new));
	public static final RegistryObject<MenuType<OEilDuWitherFouguiMenu>> O_EIL_DU_WITHER_FOUGUI = REGISTRY.register("o_eil_du_wither_fougui", () -> IForgeMenuType.create(OEilDuWitherFouguiMenu::new));
	public static final RegistryObject<MenuType<ArmureDeLendMenu>> ARMURE_DE_LEND = REGISTRY.register("armure_de_lend", () -> IForgeMenuType.create(ArmureDeLendMenu::new));
	public static final RegistryObject<MenuType<PresentationDuCodexMenu>> PRESENTATION_DU_CODEX = REGISTRY.register("presentation_du_codex", () -> IForgeMenuType.create(PresentationDuCodexMenu::new));
	public static final RegistryObject<MenuType<SuperUtilitiesMenu>> SUPER_UTILITIES = REGISTRY.register("super_utilities", () -> IForgeMenuType.create(SuperUtilitiesMenu::new));
	public static final RegistryObject<MenuType<SuperTraderMenu>> SUPER_TRADER = REGISTRY.register("super_trader", () -> IForgeMenuType.create(SuperTraderMenu::new));
	public static final RegistryObject<MenuType<PotiondExpMenu>> POTIOND_EXP = REGISTRY.register("potiond_exp", () -> IForgeMenuType.create(PotiondExpMenu::new));
	public static final RegistryObject<MenuType<EntreMateriauxMenu>> ENTRE_MATERIAUX = REGISTRY.register("entre_materiaux", () -> IForgeMenuType.create(EntreMateriauxMenu::new));
	public static final RegistryObject<MenuType<EarthenergieGuiMenu>> EARTHENERGIE_GUI = REGISTRY.register("earthenergie_gui", () -> IForgeMenuType.create(EarthenergieGuiMenu::new));
	public static final RegistryObject<MenuType<PharaonGuiMenu>> PHARAON_GUI = REGISTRY.register("pharaon_gui", () -> IForgeMenuType.create(PharaonGuiMenu::new));
	public static final RegistryObject<MenuType<SupremeGuiMenu>> SUPREME_GUI = REGISTRY.register("supreme_gui", () -> IForgeMenuType.create(SupremeGuiMenu::new));
	public static final RegistryObject<MenuType<ParfaitGuiMenu>> PARFAIT_GUI = REGISTRY.register("parfait_gui", () -> IForgeMenuType.create(ParfaitGuiMenu::new));
	public static final RegistryObject<MenuType<NaturelGuiMenu>> NATUREL_GUI = REGISTRY.register("naturel_gui", () -> IForgeMenuType.create(NaturelGuiMenu::new));
	public static final RegistryObject<MenuType<ConducteurMenu>> CONDUCTEUR = REGISTRY.register("conducteur", () -> IForgeMenuType.create(ConducteurMenu::new));
	public static final RegistryObject<MenuType<GolemCorompuGuiMenu>> GOLEM_COROMPU_GUI = REGISTRY.register("golem_corompu_gui", () -> IForgeMenuType.create(GolemCorompuGuiMenu::new));
	public static final RegistryObject<MenuType<MagieDeCompactageMenu>> MAGIE_DE_COMPACTAGE = REGISTRY.register("magie_de_compactage", () -> IForgeMenuType.create(MagieDeCompactageMenu::new));
}
