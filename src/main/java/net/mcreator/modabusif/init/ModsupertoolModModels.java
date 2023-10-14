
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modabusif.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.modabusif.client.model.Modelsnowgolem;
import net.mcreator.modabusif.client.model.Modelpharaon;
import net.mcreator.modabusif.client.model.Modelirongolem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ModsupertoolModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelirongolem.LAYER_LOCATION, Modelirongolem::createBodyLayer);
		event.registerLayerDefinition(Modelpharaon.LAYER_LOCATION, Modelpharaon::createBodyLayer);
		event.registerLayerDefinition(Modelsnowgolem.LAYER_LOCATION, Modelsnowgolem::createBodyLayer);
	}
}
