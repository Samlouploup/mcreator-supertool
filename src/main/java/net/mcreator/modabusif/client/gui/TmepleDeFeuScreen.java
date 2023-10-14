package net.mcreator.modabusif.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.modabusif.world.inventory.TmepleDeFeuMenu;
import net.mcreator.modabusif.network.TmepleDeFeuButtonMessage;
import net.mcreator.modabusif.ModsupertoolMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TmepleDeFeuScreen extends AbstractContainerScreen<TmepleDeFeuMenu> {
	private final static HashMap<String, Object> guistate = TmepleDeFeuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;

	public TmepleDeFeuScreen(TmepleDeFeuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 424;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("modsupertool:textures/screens/tmeple_de_feu.png");

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
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.tmeple_de_feu.label_un_jour_le_dieu_du_feu_vint_voi1"), 2, 8, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.tmeple_de_feu.label_fournit_a_chacun_un_plan_de_temp"), 4, 24, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.tmeple_de_feu.label_pourraient_construire_ces_temple"), 1, 37, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.tmeple_de_feu.label_temples_uniquement_la_ou_vous_s"), 3, 49, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.tmeple_de_feu.label_construisirent_leurs_temples_dan"), 4, 63, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.tmeple_de_feu.label_construisirent_en_lair_ou_ils_e"), 6, 77, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.tmeple_de_feu.label_enfin_les"), 356, 77, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.tmeple_de_feu.label_elementaux_construisirent_leurs"), 6, 91, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.tmeple_de_feu.label_de_lavecar_ils_etaient"), 288, 92, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.tmeple_de_feu.label_les_seuls_a_resister_au_feu"), 7, 106, -12829636);
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
		button_empty = new Button(this.leftPos + 377, this.topPos + 137, 35, 20, Component.translatable("gui.modsupertool.tmeple_de_feu.button_empty"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new TmepleDeFeuButtonMessage(0, x, y, z));
				TmepleDeFeuButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
	}
}
