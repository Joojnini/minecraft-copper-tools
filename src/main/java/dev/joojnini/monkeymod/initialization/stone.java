package dev.joojnini.monkeymod.initialization;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import dev.joojnini.monkeymod.initialization.custom.stonearmortier;

public class stone {
    public static class ArmourTier {
        public static final ArmorMaterial Stone = new stonearmortier(
            "stone",
            15,
            new int[] {(int) 2, 5, 6, 2},
            5,
            SoundEvents.ARMOR_EQUIP_IRON,
            0.0f,
            0.0f,
            () -> Ingredient.of(net.minecraft.world.item.Items.COPPER_INGOT)
        );
    }
}
