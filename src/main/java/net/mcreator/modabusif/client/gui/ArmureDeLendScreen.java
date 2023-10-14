package net.mcreator.modabusif.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.modabusif.world.inventory.ArmureDeLendMenu;
import net.mcreator.modabusif.network.ArmureDeLendButtonMessage;
import net.mcreator.modabusif.ModsupertoolMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ArmureDeLendScreen extends AbstractContainerScreen<ArmureDeLendMenu> {
	private final static HashMap<String, Object> guistate = ArmureDeLendMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;

	public ArmureDeLendScreen(ArmureDeLendMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 422;
		this.imageHeight = 179;
	}

	private static final ResourceLocation texture = new ResourceLocation("modsupertool:textures/screens/armure_de_lend.png");

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
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_de_lend.label_apres_avoir_retabli_la_paix_dans"), 3, 8, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_de_lend.label_qui_avait"), 376, 8, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_de_lend.label_avait_eu_vent_de_ses_exploits_da"), 3, 23, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_de_lend.label_cette_enderman_lui_dit_vient"), 239, 24, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_de_lend.label_dans_mon_monde_calmer_lender_dr"), 5, 37, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_de_lend.label_colere_folle"), 322, 37, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_de_lend.label_alors_lelu_accepta_et_lenderm"), 3, 49, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_de_lend.label_lelu_fut_epouvante_par_la_quant"), 2, 62, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_de_lend.label_qui_regne_dans_lend"), 292, 61, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_de_lend.label_il_dit_a_lenderman_il_me_fau"), 2, 76, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_de_lend.label_de_ce_nom_apporte_moi_tout_les"), 267, 77, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_de_lend.label_les_materiaux_que_tu_peut_trouve"), 3, 89, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_de_lend.label_se_mit_au_travail_et_aida_lelu"), 249, 89, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_de_lend.label_a_construire_son_armure_ils_si"), 4, 100, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_de_lend.label_magie_du_nether_et_construisiren"), 262, 100, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_de_lend.label_construisirent_larmure_parfait"), 2, 114, -12829636);
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
		button_empty = new Button(this.leftPos + 373, this.topPos + 147, 35, 20, Component.translatable("gui.modsupertool.armure_de_lend.button_empty"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new ArmureDeLendButtonMessage(0, x, y, z));
				ArmureDeLendButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
	}
}
