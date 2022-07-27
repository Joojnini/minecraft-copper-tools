package dev.joojnini.monkeymod.initialization;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ItemTier {
    public static final ForgeTier COPPER = new ForgeTier(2, 211, 5.0f, 2.5f, 22, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(net.minecraft.world.item.Items.COPPER_INGOT));
}
