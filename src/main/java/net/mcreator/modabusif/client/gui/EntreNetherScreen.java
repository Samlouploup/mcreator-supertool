package net.mcreator.modabusif.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.modabusif.world.inventory.EntreNetherMenu;
import net.mcreator.modabusif.network.EntreNetherButtonMessage;
import net.mcreator.modabusif.ModsupertoolMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class EntreNetherScreen extends AbstractContainerScreen<EntreNetherMenu> {
	private final static HashMap<String, Object> guistate = EntreNetherMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_temple_du_feu;
	Button button_flamme_parfaite;
	Button button_originedunether;
	Button button_empty;
	Button button_empty1;
	Button button_armure_du_maitre_du_nether;
	Button button_armure_de_lend;

	public EntreNetherScreen(EntreNetherMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("modsupertool:textures/screens/entre_nether.png");

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
		button_temple_du_feu = new Button(this.leftPos + 5, this.topPos + 40, 92, 20, Component.translatable("gui.modsupertool.entre_nether.button_temple_du_feu"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreNetherButtonMessage(0, x, y, z));
				EntreNetherButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_temple_du_feu", button_temple_du_feu);
		this.addRenderableWidget(button_temple_du_feu);
		button_flamme_parfaite = new Button(this.leftPos + 5, this.topPos + 67, 103, 20, Component.translatable("gui.modsupertool.entre_nether.button_flamme_parfaite"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreNetherButtonMessage(1, x, y, z));
				EntreNetherButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_flamme_parfaite", button_flamme_parfaite);
		this.addRenderableWidget(button_flamme_parfaite);
		button_originedunether = new Button(this.leftPos + 5, this.topPos + 12, 103, 20, Component.translatable("gui.modsupertool.entre_nether.button_originedunether"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreNetherButtonMessage(2, x, y, z));
				EntreNetherButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_originedunether", button_originedunether);
		this.addRenderableWidget(button_originedunether);
		button_empty = new Button(this.leftPos + 115, this.topPos + 11, 51, 20, Component.translatable("gui.modsupertool.entre_nether.button_empty"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreNetherButtonMessage(3, x, y, z));
				EntreNetherButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
		button_empty1 = new Button(this.leftPos + 132, this.topPos + 36, 35, 20, Component.translatable("gui.modsupertool.entre_nether.button_empty1"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreNetherButtonMessage(4, x, y, z));
				EntreNetherButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_empty1", button_empty1);
		this.addRenderableWidget(button_empty1);
		button_armure_du_maitre_du_nether = new Button(this.leftPos + 4, this.topPos + 90, 160, 20, Component.translatable("gui.modsupertool.entre_nether.button_armure_du_maitre_du_nether"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreNetherButtonMessage(5, x, y, z));
				EntreNetherButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:button_armure_du_maitre_du_nether", button_armure_du_maitre_du_nether);
		this.addRenderableWidget(button_armure_du_maitre_du_nether);
		button_armure_de_lend = new Button(this.leftPos + 5, this.topPos + 117, 103, 20, Component.translatable("gui.modsupertool.entre_nether.button_armure_de_lend"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new EntreNetherButtonMessage(6, x, y, z));
				EntreNetherButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		});
		guistate.put("button:button_armure_de_lend", button_armure_de_lend);
		this.addRenderableWidget(button_armure_de_lend);
	}
}
