
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chemiemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.chemiemod.ChemieModMod;

public class ChemieModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChemieModMod.MODID);
	public static final RegistryObject<CreativeModeTab> CHEM_CRAFT = REGISTRY.register("chem_craft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.chemie_mod.chem_craft")).icon(() -> new ItemStack(Items.POTION)).displayItems((parameters, tabData) -> {
				tabData.accept(ChemieModModBlocks.TITAN.get().asItem());
				tabData.accept(ChemieModModItems.TITAN_INGOT.get());
				tabData.accept(ChemieModModItems.TITAN_ARMOR_HELMET.get());
				tabData.accept(ChemieModModItems.TITAN_ARMOR_CHESTPLATE.get());
				tabData.accept(ChemieModModItems.TITAN_ARMOR_LEGGINGS.get());
				tabData.accept(ChemieModModItems.TITAN_ARMOR_BOOTS.get());
				tabData.accept(ChemieModModItems.TITAN_PICKAXE.get());
				tabData.accept(ChemieModModItems.TITANSWORD.get());
				tabData.accept(ChemieModModItems.T_ITAN_AXE.get());
				tabData.accept(ChemieModModItems.TITAN_SHOVEL.get());
				tabData.accept(ChemieModModItems.TITAN_HOE.get());
				tabData.accept(ChemieModModBlocks.MAGNESIUM_ORE.get().asItem());
				tabData.accept(ChemieModModItems.MAGNISUM_INGOT.get());
				tabData.accept(ChemieModModItems.NATRIUM_INGOT.get());
				tabData.accept(ChemieModModBlocks.NATRIUM_ORE.get().asItem());
				tabData.accept(ChemieModModItems.COKE.get());
				tabData.accept(ChemieModModBlocks.URANIUM_ORE.get().asItem());
				tabData.accept(ChemieModModItems.URAN_INGOT.get());
				tabData.accept(ChemieModModItems.LITHIUM_INGOT.get());
				tabData.accept(ChemieModModBlocks.LITHIUM_ORE.get().asItem());
				tabData.accept(ChemieModModBlocks.COKEOVEN.get().asItem());
				tabData.accept(ChemieModModItems.URANIUM_PICKAXE.get());
				tabData.accept(ChemieModModItems.URANIUM_SUPER_INGOT.get());
				tabData.accept(ChemieModModItems.GASBOTTLE.get());
				tabData.accept(ChemieModModItems.GOUTGAS.get());
				tabData.accept(ChemieModModBlocks.CALCIUM_ORE.get().asItem());
				tabData.accept(ChemieModModBlocks.SILVER_ORE.get().asItem());
				tabData.accept(ChemieModModBlocks.POTASSIUM_ORE.get().asItem());
				tabData.accept(ChemieModModItems.POTASSIUM_INGOT.get());
				tabData.accept(ChemieModModItems.CALCIUM_INGOT.get());
				tabData.accept(ChemieModModItems.SILVER_INGOT.get());
			}).build());
}
