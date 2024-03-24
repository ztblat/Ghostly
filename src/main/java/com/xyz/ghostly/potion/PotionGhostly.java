package com.xyz.ghostly.potion;


import com.xyz.ghostly.GhostlyMod;
import net.minecraft.entity.EntityLivingBase;

import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;


public class PotionGhostly extends Potion {
    protected PotionGhostly() {
        super(true, 0xffffff);
        new ResourceLocation(GhostlyMod.MODID+":" + "ghostly");
        this.setPotionName("potion.ghostlyProtection");

    }

    @Override
    public void performEffect(EntityLivingBase entity, int amplifier) {
        entity.setInvisible(true);
    }


    @Override
    public boolean isReady(int duration, int amplifier) {
        return true;
    }
}