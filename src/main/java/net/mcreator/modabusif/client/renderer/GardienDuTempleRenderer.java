
package net.mcreator.modabusif.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.modabusif.entity.GardienDuTempleEntity;
import net.mcreator.modabusif.client.model.Modelsnowgolem;

public class GardienDuTempleRenderer extends MobRenderer<GardienDuTempleEntity, Modelsnowgolem<GardienDuTempleEntity>> {
	public GardienDuTempleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsnowgolem(context.bakeLayer(Modelsnowgolem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GardienDuTempleEntity entity) {
		return new ResourceLocation("modsupertool:textures/entities/snowgolem.png");
	}
}
