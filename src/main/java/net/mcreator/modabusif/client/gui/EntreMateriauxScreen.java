package net.mcreator.modabusif.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.modabusif.world.inventory.EntreMateriauxMenu;
import net.mcreator.modabusif.network.EntreMateriauxButtonMessage;
import net.mcreator.modabusif.ModsupertoolMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class EntreMateriauxScreen extends AbstractContainerScreen<EntreMateriauxMenu> {
	private final static HashMap<String, Object> guistate = EntreMateriauxMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_earthenegie;
	Button button_pharaon;
	Button button_supreme;
	Button button_parfait;
	Button button_naturel;
	Button button_conducteur;
	Button button_empty;

	public EntreMateriauxScreen(EntreMateriauxMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 191;
	}

	private static final ResourceLocation texture = new ResourceLocation("modsupertool:textures/screens/entre_materiaux.png");

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
		button_earthenegie = new Button(this.leftPos + 4, this.topPos + 9, 82, 20, Component.translatable("gui.modsupertool.entre_materiaux.button_earthenegie"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreMateriauxButtonMessage(0, x, y, z));
				EntreMateriauxButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_earthenegie", button_earthenegie);
		this.addRenderableWidget(button_earthenegie);
		button_pharaon = new Button(this.leftPos + 5, this.topPos + 35, 61, 20, Component.translatable("gui.modsupertool.entre_materiaux.button_pharaon"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreMateriauxButtonMessage(1, x, y, z));
				EntreMateriauxButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_pharaon", button_pharaon);
		this.addRenderableWidget(button_pharaon);
		button_supreme = new Button(this.leftPos + 5, this.topPos + 61, 61, 20, Component.translatable("gui.modsupertool.entre_materiaux.button_supreme"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreMateriauxButtonMessage(2, x, y, z));
				EntreMateriauxButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_supreme", button_supreme);
		this.addRenderableWidget(button_supreme);
		button_parfait = new Button(this.leftPos + 5, this.topPos + 88, 61, 20, Component.translatable("gui.modsupertool.entre_materiaux.button_parfait"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreMateriauxButtonMessage(3, x, y, z));
				EntreMateriauxButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_parfait", button_parfait);
		this.addRenderableWidget(button_parfait);
		button_naturel = new Button(this.leftPos + 102, this.topPos + 9, 61, 20, Component.translatable("gui.modsupertool.entre_materiaux.button_naturel"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreMateriauxButtonMessage(4, x, y, z));
				EntreMateriauxButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_naturel", button_naturel);
		this.addRenderableWidget(button_naturel);
		button_conducteur = new Button(this.leftPos + 91, this.topPos + 36, 77, 20, Component.translatable("gui.modsupertool.entre_materiaux.button_conducteur"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreMateriauxButtonMessage(5, x, y, z));
				EntreMateriauxButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:button_conducteur", button_conducteur);
		this.addRenderableWidget(button_conducteur);
		button_empty = new Button(this.leftPos + 127, this.topPos + 161, 35, 20, Component.translatable("gui.modsupertool.entre_materiaux.button_empty"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreMateriauxButtonMessage(6, x, y, z));
				EntreMateriauxButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
	}
}
