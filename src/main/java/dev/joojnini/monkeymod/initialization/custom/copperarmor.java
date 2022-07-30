package dev.joojnini.monkeymod.initialization.custom;

import java.util.function.Supplier;

import dev.joojnini.monkeymod.MonkeyMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;


public record copperarmor(String name, int durability, int[] protection, int enchantability, SoundEvent equipsound, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) implements ArmorMaterial{

    private static final int[] DURABILITY_SLOT = new int[] {13, 15, 16, 11};
    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return DURABILITY_SLOT[slot.getIndex()] * this.durability;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return this.protection[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipsound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return MonkeyMod.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
