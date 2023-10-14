package net.mcreator.modabusif.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.modabusif.world.inventory.EntreCodexMenu;
import net.mcreator.modabusif.network.EntreCodexButtonMessage;
import net.mcreator.modabusif.ModsupertoolMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class EntreCodexScreen extends AbstractContainerScreen<EntreCodexMenu> {
	private final static HashMap<String, Object> guistate = EntreCodexMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_autres;
	Button button_materiaux;
	Button button_presentaion_du_codex;
	Button button_superutilities;
	Button button_magie_de_compactage;

	public EntreCodexScreen(EntreCodexMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("modsupertool:textures/screens/entre_codex.png");

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
		button_autres = new Button(this.leftPos + 110, this.topPos + 108, 56, 20, Component.translatable("gui.modsupertool.entre_codex.button_autres"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreCodexButtonMessage(0, x, y, z));
				EntreCodexButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_autres", button_autres);
		this.addRenderableWidget(button_autres);
		button_materiaux = new Button(this.leftPos + 30, this.topPos + 75, 72, 20, Component.translatable("gui.modsupertool.entre_codex.button_materiaux"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreCodexButtonMessage(1, x, y, z));
				EntreCodexButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_materiaux", button_materiaux);
		this.addRenderableWidget(button_materiaux);
		button_presentaion_du_codex = new Button(this.leftPos + 6, this.topPos + 11, 129, 20, Component.translatable("gui.modsupertool.entre_codex.button_presentaion_du_codex"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreCodexButtonMessage(2, x, y, z));
				EntreCodexButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_presentaion_du_codex", button_presentaion_du_codex);
		this.addRenderableWidget(button_presentaion_du_codex);
		button_superutilities = new Button(this.leftPos + 4, this.topPos + 108, 98, 20, Component.translatable("gui.modsupertool.entre_codex.button_superutilities"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreCodexButtonMessage(3, x, y, z));
				EntreCodexButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_superutilities", button_superutilities);
		this.addRenderableWidget(button_superutilities);
		button_magie_de_compactage = new Button(this.leftPos + 6, this.topPos + 43, 124, 20, Component.translatable("gui.modsupertool.entre_codex.button_magie_de_compactage"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreCodexButtonMessage(4, x, y, z));
				EntreCodexButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_magie_de_compactage", button_magie_de_compactage);
		this.addRenderableWidget(button_magie_de_compactage);
	}
}
