package net.mcreator.modabusif.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.modabusif.world.inventory.FlammeMagiqueGuiMenu;
import net.mcreator.modabusif.network.FlammeMagiqueGuiButtonMessage;
import net.mcreator.modabusif.ModsupertoolMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class FlammeMagiqueGuiScreen extends AbstractContainerScreen<FlammeMagiqueGuiMenu> {
	private final static HashMap<String, Object> guistate = FlammeMagiqueGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_empty;

	public FlammeMagiqueGuiScreen(FlammeMagiqueGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 392;
		this.imageHeight = 137;
	}

	private static final ResourceLocation texture = new ResourceLocation("modsupertool:textures/screens/flamme_magique_gui.png");

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
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.flamme_magique_gui.label_les_flammes_magiques_sont_lener"), 3, 4, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.flamme_magique_gui.label_utilise_par_les_mages_du_nether"), 191, 4, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.modsupertool.flamme_magique_gui.label_pour_faire_de_la_magie"), 4, 17, -12829636);
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
		button_empty = new Button(this.leftPos + 346, this.topPos + 106, 35, 20, Component.translatable("gui.modsupertool.flamme_magique_gui.button_empty"), e -> {
			if (true) {
				ModsupertoolMod.PACKET_HANDLER.sendToServer(new FlammeMagiqueGuiButtonMessage(0, x, y, z));
				FlammeMagiqueGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_empty", button_empty);
		this.addRenderableWidget(button_empty);
	}
}
