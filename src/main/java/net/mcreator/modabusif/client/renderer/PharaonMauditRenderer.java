
package net.mcreator.modabusif.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.modabusif.entity.PharaonMauditEntity;
import net.mcreator.modabusif.client.model.Modelpharaon;

public class PharaonMauditRenderer extends MobRenderer<PharaonMauditEntity, Modelpharaon<PharaonMauditEntity>> {
	public PharaonMauditRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpharaon(context.bakeLayer(Modelpharaon.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(PharaonMauditEntity entity) {
		return new ResourceLocation("modsupertool:textures/entities/pharaoh.png");
	}
}
