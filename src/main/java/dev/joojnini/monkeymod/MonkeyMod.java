package dev.joojnini.monkeymod;

import dev.joojnini.monkeymod.initialization.Iteminitialization;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
@Mod(MonkeyMod.MODID)
public class MonkeyMod {
    public static final String MODID = "monkeymod";

    public MonkeyMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        Iteminitialization.ITEMS.register(bus);
    }
}