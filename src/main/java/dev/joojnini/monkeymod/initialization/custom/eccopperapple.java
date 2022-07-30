package dev.joojnini.monkeymod.initialization.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class eccopperapple extends Item{

	public eccopperapple(Properties properties) {
		super(properties);
	}
	public boolean isFoil(ItemStack stack) {
	      return true;
	   }
	/*@Override
	public void appendHoverText(ItemStack p_41421_, Level p_41422_, List<Component> p_41423_, TooltipFlag p_41424_) {
		if(Screen.hasShiftDown()) {
			components.add(Component.literal("Vietnam > India"));
		}

		else {
			components.add(Component.literal("50% Beef, 49.9% Pork"));
		}
		super.appendHoverText(p_41421_, p_41422_, p_41423_, p_41424_);
	}
	*/
	
}