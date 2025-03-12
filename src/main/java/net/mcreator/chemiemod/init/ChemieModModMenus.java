
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemiemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.chemiemod.world.inventory.CokeovenguiMenu;
import net.mcreator.chemiemod.world.inventory.ChemTableUIMenu;
import net.mcreator.chemiemod.ChemieModMod;

public class ChemieModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ChemieModMod.MODID);
	public static final RegistryObject<MenuType<CokeovenguiMenu>> COKEOVENGUI = REGISTRY.register("cokeovengui", () -> IForgeMenuType.create(CokeovenguiMenu::new));
	public static final RegistryObject<MenuType<ChemTableUIMenu>> CHEM_TABLE_UI = REGISTRY.register("chem_table_ui", () -> IForgeMenuType.create(ChemTableUIMenu::new));
}
