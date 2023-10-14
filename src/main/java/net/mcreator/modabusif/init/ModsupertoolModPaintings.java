
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modabusif.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.modabusif.ModsupertoolMod;

public class ModsupertoolModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ModsupertoolMod.MODID);
	public static final RegistryObject<PaintingVariant> COUVRE_MUR_DE_PHARAON = REGISTRY.register("couvre_mur_de_pharaon", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> PIOCHE_BLEUE = REGISTRY.register("pioche_bleue", () -> new PaintingVariant(80, 80));
}
