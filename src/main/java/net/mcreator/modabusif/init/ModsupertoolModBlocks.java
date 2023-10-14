
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modabusif.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.modabusif.block.SupremebBlock;
import net.mcreator.modabusif.block.SuperredstoneBlock;
import net.mcreator.modabusif.block.SuperpierreBlock;
import net.mcreator.modabusif.block.SuperorBlock;
import net.mcreator.modabusif.block.SuperemeraudeBlock;
import net.mcreator.modabusif.block.SuperPlanchesBlock;
import net.mcreator.modabusif.block.SuperNetheriteBlock;
import net.mcreator.modabusif.block.SuperLapisBlock;
import net.mcreator.modabusif.block.SuperFerBBlock;
import net.mcreator.modabusif.block.SuperDiamantBlock;
import net.mcreator.modabusif.block.SuperCuivreBlock;
import net.mcreator.modabusif.block.SuperCerisierBlock;
import net.mcreator.modabusif.block.SuperBoisBlock;
import net.mcreator.modabusif.block.PharaonbBlock;
import net.mcreator.modabusif.block.EarthenergieBlock;
import net.mcreator.modabusif.block.BoisBeniBlock;
import net.mcreator.modabusif.block.BlocParfaitBlock;
import net.mcreator.modabusif.block.BlocConducteurBlock;
import net.mcreator.modabusif.ModsupertoolMod;

public class ModsupertoolModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ModsupertoolMod.MODID);
	public static final RegistryObject<Block> SUPERPIERRE = REGISTRY.register("superpierre", () -> new SuperpierreBlock());
	public static final RegistryObject<Block> SUPER_FER_B = REGISTRY.register("super_fer_b", () -> new SuperFerBBlock());
	public static final RegistryObject<Block> SUPEREMERAUDE = REGISTRY.register("superemeraude", () -> new SuperemeraudeBlock());
	public static final RegistryObject<Block> SUPERREDSTONE = REGISTRY.register("superredstone", () -> new SuperredstoneBlock());
	public static final RegistryObject<Block> EARTHENERGIE = REGISTRY.register("earthenergie", () -> new EarthenergieBlock());
	public static final RegistryObject<Block> SUPEROR = REGISTRY.register("superor", () -> new SuperorBlock());
	public static final RegistryObject<Block> SUPER_LAPIS = REGISTRY.register("super_lapis", () -> new SuperLapisBlock());
	public static final RegistryObject<Block> PHARAONB = REGISTRY.register("pharaonb", () -> new PharaonbBlock());
	public static final RegistryObject<Block> SUPER_DIAMANT = REGISTRY.register("super_diamant", () -> new SuperDiamantBlock());
	public static final RegistryObject<Block> SUPREMEB = REGISTRY.register("supremeb", () -> new SupremebBlock());
	public static final RegistryObject<Block> SUPER_NETHERITE = REGISTRY.register("super_netherite", () -> new SuperNetheriteBlock());
	public static final RegistryObject<Block> BLOC_PARFAIT = REGISTRY.register("bloc_parfait", () -> new BlocParfaitBlock());
	public static final RegistryObject<Block> SUPER_BOIS = REGISTRY.register("super_bois", () -> new SuperBoisBlock());
	public static final RegistryObject<Block> BOIS_BENI = REGISTRY.register("bois_beni", () -> new BoisBeniBlock());
	public static final RegistryObject<Block> SUPER_CERISIER = REGISTRY.register("super_cerisier", () -> new SuperCerisierBlock());
	public static final RegistryObject<Block> SUPER_PLANCHES = REGISTRY.register("super_planches", () -> new SuperPlanchesBlock());
	public static final RegistryObject<Block> SUPER_CUIVRE = REGISTRY.register("super_cuivre", () -> new SuperCuivreBlock());
	public static final RegistryObject<Block> BLOC_CONDUCTEUR = REGISTRY.register("bloc_conducteur", () -> new BlocConducteurBlock());
}
