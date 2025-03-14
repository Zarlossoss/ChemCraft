
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemiemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.chemiemod.fluid.HydrochloricAcidFluid;
import net.mcreator.chemiemod.ChemieModMod;

public class ChemieModModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, ChemieModMod.MODID);
	public static final RegistryObject<FlowingFluid> HYDROCHLORIC_ACID = REGISTRY.register("hydrochloric_acid", () -> new HydrochloricAcidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_HYDROCHLORIC_ACID = REGISTRY.register("flowing_hydrochloric_acid", () -> new HydrochloricAcidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(HYDROCHLORIC_ACID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_HYDROCHLORIC_ACID.get(), RenderType.translucent());
		}
	}
}
