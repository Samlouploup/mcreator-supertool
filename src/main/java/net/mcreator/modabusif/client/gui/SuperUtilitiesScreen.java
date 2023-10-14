package net.mcreator.modabusif.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.modabusif.world.inventory.SuperUtilitiesMenu;
import net.mcreator.modabusif.network.SuperUtilitiesButtonMessage;
import net.mcreator.modabusif.ModsupertoolMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class SuperUtilitiesScreen extends AbstractContainerScreen<SuperUtilitiesMenu> {
	private final static HashMap<String, Object> guistate = SuperUtilitiesMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;
	Button button_supertrader;
	Button button_potion_dexp;

	public SuperUtilitiesScreen(SuperUtilitiesMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 440;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("modsupertool:textures/screens/super_utilities.png");

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
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.super_utilities.label_les_supers_utilities_sont_des_ob"), 7, 3, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.super_utilities.label_compactage"), 8, 19, -12829636);
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
		button_empty = new Button(this.leftPos + 394, this.topPos + 137, 35, 20, Component.translatable("gui.modsupertool.super_utilities.button_empty"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new SuperUtilitiesButtonMessage(0, x, y, z));
				SuperUtilitiesButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_supertrader = new Button(this.leftPos + 16, this.topPos + 39, 82, 20, Component.translatable("gui.modsupertool.super_utilities.button_supertrader"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new SuperUtilitiesButtonMessage(1, x, y, z));
				SuperUtilitiesButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_supertrader", button_supertrader);
		this.addRenderableWidget(button_supertrader);
		button_potion_dexp = new Button(this.leftPos + 15, this.topPos + 65, 87, 20, Component.translatable("gui.modsupertool.super_utilities.button_potion_dexp"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new SuperUtilitiesButtonMessage(2, x, y, z));
				SuperUtilitiesButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_potion_dexp", button_potion_dexp);
		this.addRenderableWidget(button_potion_dexp);
	}
}
