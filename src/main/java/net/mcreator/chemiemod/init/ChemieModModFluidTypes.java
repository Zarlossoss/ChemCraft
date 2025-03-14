
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemiemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.chemiemod.fluid.types.HydrochloricAcidFluidType;
import net.mcreator.chemiemod.ChemieModMod;

public class ChemieModModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ChemieModMod.MODID);
	public static final RegistryObject<FluidType> HYDROCHLORIC_ACID_TYPE = REGISTRY.register("hydrochloric_acid", () -> new HydrochloricAcidFluidType());
}
