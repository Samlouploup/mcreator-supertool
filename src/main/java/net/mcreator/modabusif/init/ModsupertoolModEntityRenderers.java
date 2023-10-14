
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.modabusif.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.modabusif.client.renderer.PharaonMauditRenderer;
import net.mcreator.modabusif.client.renderer.GolemCorompuRenderer;
import net.mcreator.modabusif.client.renderer.GardienDuTempleRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModsupertoolModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ModsupertoolModEntities.PHARAON_MAUDIT.get(), PharaonMauditRenderer::new);
		event.registerEntityRenderer(ModsupertoolModEntities.GOLEM_COROMPU.get(), GolemCorompuRenderer::new);
		event.registerEntityRenderer(ModsupertoolModEntities.GARDIEN_DU_TEMPLE.get(), GardienDuTempleRenderer::new);
		event.registerEntityRenderer(ModsupertoolModEntities.GARDIEN_DU_TEMPLE_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
