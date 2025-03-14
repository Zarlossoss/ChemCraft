
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.chemiemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ChemieModModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == ChemieModModVillagerProfessions.CUSTOM_VILLAGER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(ChemieModModItems.URAN_INGOT.get()),

					new ItemStack(Blocks.EMERALD_BLOCK, 3), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(ChemieModModItems.TITAN_INGOT.get(), 16),

					new ItemStack(ChemieModModBlocks.COKEOVEN.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.COAL, 16),

					new ItemStack(ChemieModModItems.COKE.get(), 8), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(ChemieModModItems.GASBOTTLE.get()), new ItemStack(Items.COAL), new ItemStack(ChemieModModItems.GOUTGAS.get()), 10, 5, 0.05f));
		}
	}
}
