
package net.mcreator.chemiemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.chemiemod.init.ChemieModModFluids;

public class HydrochloricAcidItem extends BucketItem {
	public HydrochloricAcidItem() {
		super(ChemieModModFluids.HYDROCHLORIC_ACID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
