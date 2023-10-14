
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modabusif.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class ModsupertoolModTabs {
	public static CreativeModeTab TAB_ARMURES_OUTILS_SUPER_TOOLS;
	public static CreativeModeTab TAB_ITEMS_DIVERS_SUPER_TOOLS;
	public static CreativeModeTab TAB_SUPER_BLOC;

	public static void load() {
		TAB_ARMURES_OUTILS_SUPER_TOOLS = new CreativeModeTab("tabarmures_outils_super_tools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ModsupertoolModItems.PIOCHE_SUPREME.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ITEMS_DIVERS_SUPER_TOOLS = new CreativeModeTab("tabitems_divers_super_tools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ModsupertoolModItems.LE_CODEX.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SUPER_BLOC = new CreativeModeTab("tabsuper_bloc") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(ModsupertoolModBlocks.PHARAONB.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
