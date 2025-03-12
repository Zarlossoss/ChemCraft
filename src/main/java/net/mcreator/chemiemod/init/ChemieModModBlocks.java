
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemiemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.chemiemod.block.UraniumOreBlock;
import net.mcreator.chemiemod.block.TitanBlock;
import net.mcreator.chemiemod.block.SilverOreBlock;
import net.mcreator.chemiemod.block.PotassiumOreBlock;
import net.mcreator.chemiemod.block.NatriumOreBlock;
import net.mcreator.chemiemod.block.MagnesiumOreBlock;
import net.mcreator.chemiemod.block.LithiumOreBlock;
import net.mcreator.chemiemod.block.CokeovenBlock;
import net.mcreator.chemiemod.block.ChemTableBlock;
import net.mcreator.chemiemod.block.CalciumOreBlock;
import net.mcreator.chemiemod.ChemieModMod;

public class ChemieModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ChemieModMod.MODID);
	public static final RegistryObject<Block> TITAN = REGISTRY.register("titan", () -> new TitanBlock());
	public static final RegistryObject<Block> MAGNESIUM_ORE = REGISTRY.register("magnesium_ore", () -> new MagnesiumOreBlock());
	public static final RegistryObject<Block> NATRIUM_ORE = REGISTRY.register("natrium_ore", () -> new NatriumOreBlock());
	public static final RegistryObject<Block> URANIUM_ORE = REGISTRY.register("uranium_ore", () -> new UraniumOreBlock());
	public static final RegistryObject<Block> LITHIUM_ORE = REGISTRY.register("lithium_ore", () -> new LithiumOreBlock());
	public static final RegistryObject<Block> COKEOVEN = REGISTRY.register("cokeoven", () -> new CokeovenBlock());
	public static final RegistryObject<Block> CALCIUM_ORE = REGISTRY.register("calcium_ore", () -> new CalciumOreBlock());
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final RegistryObject<Block> POTASSIUM_ORE = REGISTRY.register("potassium_ore", () -> new PotassiumOreBlock());
	public static final RegistryObject<Block> CHEM_TABLE = REGISTRY.register("chem_table", () -> new ChemTableBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
