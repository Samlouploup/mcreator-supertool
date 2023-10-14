package net.mcreator.modabusif.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.modabusif.world.inventory.BouteilleMenu;
import net.mcreator.modabusif.network.BouteilleButtonMessage;
import net.mcreator.modabusif.ModsupertoolMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BouteilleScreen extends AbstractContainerScreen<BouteilleMenu> {
	private final static HashMap<String, Object> guistate = BouteilleMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_bottes;
	Button button_jambiere;
	Button button_plastron;
	Button button_casque;
	Button button_terre_1024;
	Button button_terre_2048;

	public BouteilleScreen(BouteilleMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 320;
		this.imageHeight = 179;
	}

	private static final ResourceLocation texture = new ResourceLocation("modsupertool:textures/screens/bouteille.png");

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
		button_bottes = new Button(this.leftPos + 132, this.topPos + 136, 56, 20, Component.translatable("gui.modsupertool.bouteille.button_bottes"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new BouteilleButtonMessage(0, x, y, z));
				BouteilleButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_bottes", button_bottes);
		this.addRenderableWidget(button_bottes);
		button_jambiere = new Button(this.leftPos + 127, this.topPos + 108, 67, 20, Component.translatable("gui.modsupertool.bouteille.button_jambiere"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new BouteilleButtonMessage(1, x, y, z));
				BouteilleButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_jambiere", button_jambiere);
		this.addRenderableWidget(button_jambiere);
		button_plastron = new Button(this.leftPos + 104, this.topPos + 82, 122, 20, Component.translatable("gui.modsupertool.bouteille.button_plastron"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new BouteilleButtonMessage(2, x, y, z));
				BouteilleButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_plastron", button_plastron);
		this.addRenderableWidget(button_plastron);
		button_casque = new Button(this.leftPos + 45, this.topPos + 56, 251, 20, Component.translatable("gui.modsupertool.bouteille.button_casque"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new BouteilleButtonMessage(3, x, y, z));
				BouteilleButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_casque", button_casque);
		this.addRenderableWidget(button_casque);
		button_terre_1024 = new Button(this.leftPos + 13, this.topPos + 128, 87, 20, Component.translatable("gui.modsupertool.bouteille.button_terre_1024"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new BouteilleButtonMessage(4, x, y, z));
				BouteilleButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_terre_1024", button_terre_1024);
		this.addRenderableWidget(button_terre_1024);
		button_terre_2048 = new Button(this.leftPos + 215, this.topPos + 129, 87, 20, Component.translatable("gui.modsupertool.bouteille.button_terre_2048"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new BouteilleButtonMessage(5, x, y, z));
				BouteilleButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:button_terre_2048", button_terre_2048);
		this.addRenderableWidget(button_terre_2048);
	}
}
