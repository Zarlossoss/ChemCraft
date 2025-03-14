package net.mcreator.chemiemod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.chemiemod.world.inventory.CokeovenguiMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class CokeovenguiScreen extends AbstractContainerScreen<CokeovenguiMenu> {
	private final static HashMap<String, Object> guistate = CokeovenguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CokeovenguiScreen(CokeovenguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 179;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("chemie_mod:textures/screens/cokeovengui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.chemie_mod.cokeovengui.label_coke_oven"), 10, 7, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.chemie_mod.cokeovengui.label_coal"), 64, 46, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.chemie_mod.cokeovengui.label_empty1"), 58, 46, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
