package net.mcreator.modabusif.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.modabusif.world.inventory.ArmureDuMaitreDuNetherGuiMenu;
import net.mcreator.modabusif.network.ArmureDuMaitreDuNetherGuiButtonMessage;
import net.mcreator.modabusif.ModsupertoolMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ArmureDuMaitreDuNetherGuiScreen extends AbstractContainerScreen<ArmureDuMaitreDuNetherGuiMenu> {
	private final static HashMap<String, Object> guistate = ArmureDuMaitreDuNetherGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;

	public ArmureDuMaitreDuNetherGuiScreen(ArmureDuMaitreDuNetherGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 424;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("modsupertool:textures/screens/armure_du_maitre_du_nether_gui.png");

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
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_du_maitre_du_nether_gui.label_alors_que_les_trois_clans_etaien"), 6, 4, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_du_maitre_du_nether_gui.label_dit_fabriquez_ensemble_une_a"), 5, 19, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_du_maitre_du_nether_gui.label_porteur_au_nether"), 332, 19, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_du_maitre_du_nether_gui.label_puis_donnez_la_a_un_elu_pour_qu"), 5, 31, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_du_maitre_du_nether_gui.label_trois_clans_se_mirent_aussitot_a"), 5, 43, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_du_maitre_du_nether_gui.label_les_berserks_fabriquerent_larmu"), 3, 61, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_du_maitre_du_nether_gui.label_de_leurs_energie_pour_donner_au"), 270, 61, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_du_maitre_du_nether_gui.label_au_porteur_une_force_et_une_vite"), 4, 73, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_du_maitre_du_nether_gui.label_dans_le_nether_les"), 308, 74, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_du_maitre_du_nether_gui.label_mages_lenchanterent_pour_suppri"), 5, 87, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_du_maitre_du_nether_gui.label_et_permettre_au_porteur"), 346, 86, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_du_maitre_du_nether_gui.label_au_porteur_de_voler_dans_le_neth"), 5, 98, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_du_maitre_du_nether_gui.label_elementaux_diffuserent_leurs_ma"), 220, 98, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.armure_du_maitre_du_nether_gui.label_pour_immuniser_le_porteur_de_ce"), 4, 110, -12829636);
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
		button_empty = new Button(this.leftPos + 376, this.topPos + 136, 35, 20, Component.translatable("gui.modsupertool.armure_du_maitre_du_nether_gui.button_empty"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new ArmureDuMaitreDuNetherGuiButtonMessage(0, x, y, z));
				ArmureDuMaitreDuNetherGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
	}
}
