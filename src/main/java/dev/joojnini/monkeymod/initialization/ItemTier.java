package dev.joojnini.monkeymod.initialization;

import dev.joojnini.monkeymod.initialization.custom.copperarmor;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ItemTier {
    //////////////////////////////////////////////////////////////////
    
    //////////////////////////////////////////////////////////////////
    public static final ForgeTier COPPER = new ForgeTier(2, 
    211, 
    5.0f, 
    2.5f, 
    22, 
    BlockTags.NEEDS_STONE_TOOL, 
    () -> Ingredient.of(net.minecraft.world.item.Items.COPPER_INGOT));
    //////////////////////////////////////////////////////////////////
    
    //////////////////////////////////////////////////////////////////
    public static final ForgeTier COPPERHOE = new ForgeTier(2, 
    211, 
    5.0f, 
    0f, 
    20, 
    BlockTags.NEEDS_STONE_TOOL, 
    () -> Ingredient.of(net.minecraft.world.item.Items.COPPER_INGOT));
    //////////////////////////////////////////////////////////////////
    
    //////////////////////////////////////////////////////////////////
    public static class ArmorTier {
        public static final ArmorMaterial Copper = new copperarmor(
            "copper",
            14,
            new int[] {(int) 2, 4, 5, 2},
            21,
            SoundEvents.ARMOR_EQUIP_IRON,
            0.0f,
            0.0f,
            () -> Ingredient.of(net.minecraft.world.item.Items.COPPER_INGOT)

        );
    }

    
}
