
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemiemod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.chemiemod.client.gui.CokeovenguiScreen;
import net.mcreator.chemiemod.client.gui.ChemTableUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ChemieModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ChemieModModMenus.COKEOVENGUI.get(), CokeovenguiScreen::new);
			MenuScreens.register(ChemieModModMenus.CHEM_TABLE_UI.get(), ChemTableUIScreen::new);
		});
	}
}
