package com.xyz.ghostly.potion;

import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class PotionLoader {
    public static Potion potionGhostly;

    public PotionLoader(FMLPreInitializationEvent event)
    {
        potionGhostly = new PotionGhostly();
    }

    @SubscribeEvent
    public static void registerPotion(RegistryEvent.Register<Potion> event){
        event.getRegistry().register(potionGhostly.setRegistryName("ghostly:ghostly"));
    }
}
