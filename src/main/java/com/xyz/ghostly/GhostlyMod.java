package com.xyz.ghostly;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = GhostlyMod.MODID, name = GhostlyMod.NAME, version = GhostlyMod.VERSION, acceptedMinecraftVersions = "1.12.2")
public class GhostlyMod {
    public static final String MODID = "ghostly";
    public static final String NAME = "Ghostly";
    public static final String VERSION = "1.0.0";
    @Mod.Instance(GhostlyMod.MODID)
    public static GhostlyMod instance;

    @SidedProxy(clientSide = "com.xyz.ghostly.ClientProxy",
            serverSide = "com.xyz.ghostly.CommonProxy")
    public static CommonProxy proxy;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}

