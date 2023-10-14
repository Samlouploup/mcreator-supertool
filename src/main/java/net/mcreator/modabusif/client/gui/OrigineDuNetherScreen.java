package net.mcreator.modabusif.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.modabusif.world.inventory.OrigineDuNetherMenu;
import net.mcreator.modabusif.network.OrigineDuNetherButtonMessage;
import net.mcreator.modabusif.ModsupertoolMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class OrigineDuNetherScreen extends AbstractContainerScreen<OrigineDuNetherMenu> {
	private final static HashMap<String, Object> guistate = OrigineDuNetherMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;

	public OrigineDuNetherScreen(OrigineDuNetherMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 414;
		this.imageHeight = 234;
	}

	private static final ResourceLocation texture = new ResourceLocation("modsupertool:textures/screens/origine_du_nether.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_autrefois_le_nether_etait_flori"), 28, 21, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_civilisation_puissante_et_develo1"), 28, 33, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_compactage_et_celles_des_4_eleme"), 28, 44, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_un_roi_sage_et_bon_et_faisait_ch"), 29, 56, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_pour_obtenir_leur_grace_et_atte"), 26, 68, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_heureux_jusquau_jour_ou_une_ter1"), 29, 81, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_alors_le_roi_ne_voulant_pas_fai1"), 28, 94, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_lors_de_la_fete_des_sacrifices2"), 27, 107, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_dieux_du_feu_de_la_ferme_et_de"), 28, 119, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_demandait_tout"), 283, 119, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_trois_de_la_nourriture_mais_ce"), 28, 131, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_entrerent_dans_un_colere"), 233, 131, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_folle_le_dieux_du_feu_brulat_l"), 28, 142, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_germer_des_lacs_de"), 271, 142, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_lave_immenses_coupant_tout_acce"), 28, 154, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_dieu_de_la"), 330, 154, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_ferme_lui_transforma_tout_les"), 28, 166, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_en_cochon_et_le_dieu"), 238, 166, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_de_la"), 345, 166, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_richesse_les_obligeat_a_venerer"), 28, 177, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_enchantementdes_annees_plus_tar"), 28, 188, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_lon_appelle"), 332, 188, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_aujourdhui_piglin_se_sont_rass"), 27, 198, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_et_les"), 339, 198, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_berserks_puis_de_la_lave_naqui"), 27, 209, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_de_feu_qui"), 294, 209, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.origine_du_nether.label_formerent_un_troisieme_clan"), 28, 219, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_empty = new Button(this.leftPos + 328, this.topPos + 10, 35, 20, Component.translatable("gui.modsupertool.origine_du_nether.button_empty"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new OrigineDuNetherButtonMessage(0, x, y, z));
				OrigineDuNetherButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
	}
}
