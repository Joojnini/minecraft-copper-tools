package dev.joojnini.monkeymod.initialization;

import dev.joojnini.monkeymod.MonkeyMod;
import dev.joojnini.monkeymod.initialization.custom.eccopperapple;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
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
    public static final RegistryObject<Item> ECOPPER_APPLE = ITEMS.register("ecopper_apple", () -> new eccopperapple(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(7).saturationMod(0.6f).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 5000, 1), 1).effect(() -> new MobEffectInstance(MobEffects.JUMP, 600, 3), 1).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 3), 1).build())));
    public static final RegistryObject<Item> PLACEHOLDER_1 = ITEMS.register("placeholder_item", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).alwaysEat().fast().effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 600, 0), 1).effect(() -> new MobEffectInstance(MobEffects.JUMP, 60, 1), 1).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 1), 1).build())));
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(ItemTier.COPPER, (float) 0.5, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(ItemTier.COPPER, 5, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ItemTier.COPPER, 0, -2.8f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(ItemTier.COPPERHOE, 0, -1.5f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(ItemTier.COPPER, 2, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
}
