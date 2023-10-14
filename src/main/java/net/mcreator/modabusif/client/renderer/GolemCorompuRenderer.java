
package net.mcreator.modabusif.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.modabusif.entity.GolemCorompuEntity;
import net.mcreator.modabusif.client.model.Modelirongolem;

public class GolemCorompuRenderer extends MobRenderer<GolemCorompuEntity, Modelirongolem<GolemCorompuEntity>> {
	public GolemCorompuRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelirongolem(context.bakeLayer(Modelirongolem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GolemCorompuEntity entity) {
		return new ResourceLocation("modsupertool:textures/entities/irongolem.png");
	}
}
