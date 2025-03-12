
package net.mcreator.chemiemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BariumIngotItem extends Item {
	public BariumIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
