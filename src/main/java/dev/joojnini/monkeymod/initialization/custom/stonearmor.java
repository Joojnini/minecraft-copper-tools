package dev.joojnini.monkeymod.initialization.custom;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import dev.joojnini.monkeymod.initialization.Iteminitialization;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;



public class stonearmor extends ArmorItem {

    public stonearmor(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
        super(material, slot, properties);
    }


    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        if (!world.isClientSide()){
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 0));
        }

        boolean fullSet = player.getItemBySlot(EquipmentSlot.HEAD).getItem() == Iteminitialization.STONE_HELMET.get() && player.getItemBySlot(EquipmentSlot.CHEST).getItem() == Iteminitialization.STONE_CHESTPLATE.get() && player.getItemBySlot(EquipmentSlot.LEGS).getItem() == Iteminitialization.STONE_LEGGINGS.get() && player.getItemBySlot(EquipmentSlot.FEET).getItem() == Iteminitialization.STONE_BOOTS.get();

        if (fullSet){
        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 1));
        }       
        }
    }   