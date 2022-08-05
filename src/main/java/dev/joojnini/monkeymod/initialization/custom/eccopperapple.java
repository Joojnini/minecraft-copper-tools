package dev.joojnini.monkeymod.initialization.custom;

import java.util.List;

import javax.annotation.Nullable;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

public class eccopperapple extends Item{

	public eccopperapple(Properties properties) {
		super(properties);
	}
	public boolean isFoil(ItemStack stack) {
	      return true;
	   }
	   @Override
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
    tooltip.add(Component.literal("§650% Pork 49.9% Beef"));
    super.appendHoverText(stack, worldIn, tooltip, flagIn);
	}
}
