package com.xyz.ghostly;

import com.xyz.ghostly.potion.PotionLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        new PotionLoader(event);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // TODO
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // TODO
    }
}
