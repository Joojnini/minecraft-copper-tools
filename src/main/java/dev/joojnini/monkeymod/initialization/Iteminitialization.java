package dev.joojnini.monkeymod.initialization;

import dev.joojnini.monkeymod.MonkeyMod;
import dev.joojnini.monkeymod.initialization.ItemTier.ArmorTier;
import dev.joojnini.monkeymod.initialization.stone.ArmourTier;
import dev.joojnini.monkeymod.initialization.custom.eccopperapple;
import dev.joojnini.monkeymod.initialization.custom.stonearmor;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Iteminitialization {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MonkeyMod.MODID);
    // Copper Apples
    public static final RegistryObject<Item> PLACEHOLDER_1 = ITEMS.register("placeholder_item", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).alwaysEat().fast().effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 600, 0), 1).effect(() -> new MobEffectInstance(MobEffects.JUMP, 80, 1), 1).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 80, 1), 1).build())));
    public static final RegistryObject<Item> ECOPPER_APPLE = ITEMS.register("ecopper_apple", () -> new eccopperapple(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(7).saturationMod(0.6f).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 5000, 1), 1).effect(() -> new MobEffectInstance(MobEffects.JUMP, 550, 3), 1).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 550, 3), 1).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 550, 3), 1).build())));
    // Copper Tools
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(ItemTier.COPPER, (float) 0.5, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(ItemTier.COPPER, 5, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ItemTier.COPPER, 0, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(ItemTier.COPPERHOE, 0, -1.5f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(ItemTier.COPPER, 2, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    // Copper Armor
    public static final RegistryObject<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ArmorItem(ArmorTier.Copper, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ArmorItem(ArmorTier.Copper, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ArmorItem(ArmorTier.Copper, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(ArmorTier.Copper, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    // Stone Armor
    public static final RegistryObject<ArmorItem> STONE_HELMET = ITEMS.register("stone_helmet", () -> new stonearmor(ArmourTier.Stone, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> STONE_CHESTPLATE = ITEMS.register("stone_chestplate", () -> new stonearmor(ArmourTier.Stone, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> STONE_LEGGINGS = ITEMS.register("stone_leggings", () -> new stonearmor(ArmourTier.Stone, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> STONE_BOOTS = ITEMS.register("stone_boots", () -> new stonearmor(ArmourTier.Stone, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
}
