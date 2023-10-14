package net.mcreator.modabusif.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.modabusif.world.inventory.EntreItemsMenu;
import net.mcreator.modabusif.network.EntreItemsButtonMessage;
import net.mcreator.modabusif.ModsupertoolMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class EntreItemsScreen extends AbstractContainerScreen<EntreItemsMenu> {
	private final static HashMap<String, Object> guistate = EntreItemsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_flamme_magique;
	Button button_ame_monde;
	Button button_empty;
	Button button_empty1;
	Button button_oeil_du_wither_fou;

	public EntreItemsScreen(EntreItemsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("modsupertool:textures/screens/entre_items.png");

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
		button_flamme_magique = new Button(this.leftPos + 10, this.topPos + 11, 98, 20, Component.translatable("gui.modsupertool.entre_items.button_flamme_magique"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreItemsButtonMessage(0, x, y, z));
				EntreItemsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_flamme_magique", button_flamme_magique);
		this.addRenderableWidget(button_flamme_magique);
		button_ame_monde = new Button(this.leftPos + 10, this.topPos + 38, 72, 20, Component.translatable("gui.modsupertool.entre_items.button_ame_monde"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreItemsButtonMessage(1, x, y, z));
				EntreItemsButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_ame_monde", button_ame_monde);
		this.addRenderableWidget(button_ame_monde);
		button_empty = new Button(this.leftPos + 116, this.topPos + 11, 51, 20, Component.translatable("gui.modsupertool.entre_items.button_empty"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreItemsButtonMessage(2, x, y, z));
				EntreItemsButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = new Button(this.leftPos + 131, this.topPos + 40, 35, 20, Component.translatable("gui.modsupertool.entre_items.button_empty1"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreItemsButtonMessage(3, x, y, z));
				EntreItemsButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_oeil_du_wither_fou = new Button(this.leftPos + 9, this.topPos + 65, 113, 20, Component.translatable("gui.modsupertool.entre_items.button_oeil_du_wither_fou"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreItemsButtonMessage(4, x, y, z));
				EntreItemsButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_oeil_du_wither_fou", button_oeil_du_wither_fou);
		this.addRenderableWidget(button_oeil_du_wither_fou);
	}
}
