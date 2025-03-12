
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemiemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.chemiemod.item.UraniumSuperIngotItem;
import net.mcreator.chemiemod.item.UraniumPickaxeItem;
import net.mcreator.chemiemod.item.UranIngotItem;
import net.mcreator.chemiemod.item.TitanswordItem;
import net.mcreator.chemiemod.item.TitanShovelItem;
import net.mcreator.chemiemod.item.TitanPickaxeItem;
import net.mcreator.chemiemod.item.TitanIngotItem;
import net.mcreator.chemiemod.item.TitanHoeItem;
import net.mcreator.chemiemod.item.TitanArmorItem;
import net.mcreator.chemiemod.item.TItanAxeItem;
import net.mcreator.chemiemod.item.SilverIngotItem;
import net.mcreator.chemiemod.item.PotassiumIngotItem;
import net.mcreator.chemiemod.item.NatriumIngotItem;
import net.mcreator.chemiemod.item.MagnisumIngotItem;
import net.mcreator.chemiemod.item.LithiumIngotItem;
import net.mcreator.chemiemod.item.GoutgasItem;
import net.mcreator.chemiemod.item.GasbottleItem;
import net.mcreator.chemiemod.item.CokeItem;
import net.mcreator.chemiemod.item.CalciumIngotItem;
import net.mcreator.chemiemod.item.BariumIngotItem;
import net.mcreator.chemiemod.ChemieModMod;

public class ChemieModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ChemieModMod.MODID);
	public static final RegistryObject<Item> TITAN = block(ChemieModModBlocks.TITAN);
	public static final RegistryObject<Item> TITAN_INGOT = REGISTRY.register("titan_ingot", () -> new TitanIngotItem());
	public static final RegistryObject<Item> TITAN_ARMOR_HELMET = REGISTRY.register("titan_armor_helmet", () -> new TitanArmorItem.Helmet());
	public static final RegistryObject<Item> TITAN_ARMOR_CHESTPLATE = REGISTRY.register("titan_armor_chestplate", () -> new TitanArmorItem.Chestplate());
	public static final RegistryObject<Item> TITAN_ARMOR_LEGGINGS = REGISTRY.register("titan_armor_leggings", () -> new TitanArmorItem.Leggings());
	public static final RegistryObject<Item> TITAN_ARMOR_BOOTS = REGISTRY.register("titan_armor_boots", () -> new TitanArmorItem.Boots());
	public static final RegistryObject<Item> TITAN_PICKAXE = REGISTRY.register("titan_pickaxe", () -> new TitanPickaxeItem());
	public static final RegistryObject<Item> TITANSWORD = REGISTRY.register("titansword", () -> new TitanswordItem());
	public static final RegistryObject<Item> T_ITAN_AXE = REGISTRY.register("t_itan_axe", () -> new TItanAxeItem());
	public static final RegistryObject<Item> TITAN_SHOVEL = REGISTRY.register("titan_shovel", () -> new TitanShovelItem());
	public static final RegistryObject<Item> TITAN_HOE = REGISTRY.register("titan_hoe", () -> new TitanHoeItem());
	public static final RegistryObject<Item> MAGNESIUM_ORE = block(ChemieModModBlocks.MAGNESIUM_ORE);
	public static final RegistryObject<Item> MAGNISUM_INGOT = REGISTRY.register("magnisum_ingot", () -> new MagnisumIngotItem());
	public static final RegistryObject<Item> NATRIUM_INGOT = REGISTRY.register("natrium_ingot", () -> new NatriumIngotItem());
	public static final RegistryObject<Item> NATRIUM_ORE = block(ChemieModModBlocks.NATRIUM_ORE);
	public static final RegistryObject<Item> COKE = REGISTRY.register("coke", () -> new CokeItem());
	public static final RegistryObject<Item> URANIUM_ORE = block(ChemieModModBlocks.URANIUM_ORE);
	public static final RegistryObject<Item> URAN_INGOT = REGISTRY.register("uran_ingot", () -> new UranIngotItem());
	public static final RegistryObject<Item> LITHIUM_INGOT = REGISTRY.register("lithium_ingot", () -> new LithiumIngotItem());
	public static final RegistryObject<Item> LITHIUM_ORE = block(ChemieModModBlocks.LITHIUM_ORE);
	public static final RegistryObject<Item> COKEOVEN = block(ChemieModModBlocks.COKEOVEN);
	public static final RegistryObject<Item> URANIUM_PICKAXE = REGISTRY.register("uranium_pickaxe", () -> new UraniumPickaxeItem());
	public static final RegistryObject<Item> URANIUM_SUPER_INGOT = REGISTRY.register("uranium_super_ingot", () -> new UraniumSuperIngotItem());
	public static final RegistryObject<Item> GASBOTTLE = REGISTRY.register("gasbottle", () -> new GasbottleItem());
	public static final RegistryObject<Item> GOUTGAS = REGISTRY.register("goutgas", () -> new GoutgasItem());
	public static final RegistryObject<Item> CALCIUM_ORE = block(ChemieModModBlocks.CALCIUM_ORE);
	public static final RegistryObject<Item> SILVER_ORE = block(ChemieModModBlocks.SILVER_ORE);
	public static final RegistryObject<Item> POTASSIUM_ORE = block(ChemieModModBlocks.POTASSIUM_ORE);
	public static final RegistryObject<Item> POTASSIUM_INGOT = REGISTRY.register("potassium_ingot", () -> new PotassiumIngotItem());
	public static final RegistryObject<Item> CALCIUM_INGOT = REGISTRY.register("calcium_ingot", () -> new CalciumIngotItem());
	public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
	public static final RegistryObject<Item> CHEM_TABLE = block(ChemieModModBlocks.CHEM_TABLE);
	public static final RegistryObject<Item> BARIUM_INGOT = REGISTRY.register("barium_ingot", () -> new BariumIngotItem());
	public static final RegistryObject<Item> BARIUM_ORE = block(ChemieModModBlocks.BARIUM_ORE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
