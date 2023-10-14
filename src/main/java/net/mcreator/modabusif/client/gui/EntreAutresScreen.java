package net.mcreator.modabusif.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.modabusif.world.inventory.EntreAutresMenu;
import net.mcreator.modabusif.network.EntreAutresButtonMessage;
import net.mcreator.modabusif.ModsupertoolMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class EntreAutresScreen extends AbstractContainerScreen<EntreAutresMenu> {
	private final static HashMap<String, Object> guistate = EntreAutresMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_nether;
	Button button_items;
	Button button_empty;
	Button button_golem_corompu;

	public EntreAutresScreen(EntreAutresMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("modsupertool:textures/screens/entre_autres.png");

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
		button_nether = new Button(this.leftPos + 64, this.topPos + 36, 56, 20, Component.translatable("gui.modsupertool.entre_autres.button_nether"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreAutresButtonMessage(0, x, y, z));
				EntreAutresButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_nether", button_nether);
		this.addRenderableWidget(button_nether);
		button_items = new Button(this.leftPos + 4, this.topPos + 36, 51, 20, Component.translatable("gui.modsupertool.entre_autres.button_items"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreAutresButtonMessage(1, x, y, z));
				EntreAutresButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_items", button_items);
		this.addRenderableWidget(button_items);
		button_empty = new Button(this.leftPos + 133, this.topPos + 6, 35, 20, Component.translatable("gui.modsupertool.entre_autres.button_empty"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreAutresButtonMessage(2, x, y, z));
				EntreAutresButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_golem_corompu = new Button(this.leftPos + 4, this.topPos + 66, 93, 20, Component.translatable("gui.modsupertool.entre_autres.button_golem_corompu"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreAutresButtonMessage(3, x, y, z));
				EntreAutresButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_golem_corompu", button_golem_corompu);
		this.addRenderableWidget(button_golem_corompu);
	}
}
