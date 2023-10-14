
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modabusif.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.modabusif.world.features.TempleDuFeuFeature;
import net.mcreator.modabusif.world.features.NidDeDragonFeature;
import net.mcreator.modabusif.ModsupertoolMod;

@Mod.EventBusSubscriber
public class ModsupertoolModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ModsupertoolMod.MODID);
	public static final RegistryObject<Feature<?>> TEMPLE_DU_FEU = REGISTRY.register("temple_du_feu", TempleDuFeuFeature::feature);
	public static final RegistryObject<Feature<?>> NID_DE_DRAGON = REGISTRY.register("nid_de_dragon", NidDeDragonFeature::feature);
}
