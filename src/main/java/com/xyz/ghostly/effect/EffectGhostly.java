package com.xyz.ghostly.effect;


import com.xyz.ghostly.potion.PotionGhostly;
import com.xyz.ghostly.potion.PotionLoader;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class EffectGhostly {
    @SubscribeEvent
    public static void onBreakEvent(BlockEvent.BreakEvent event){
        EntityPlayer player = event.getPlayer();
        if(player.isPotionActive(PotionLoader.potionGhostly)){
            player.removePotionEffect(PotionLoader.potionGhostly);
        }
    }
    @SubscribeEvent
    public static void  onAttackEntityEvent(AttackEntityEvent event) {
        EntityPlayer player = event.getEntityPlayer();
        if(player.isPotionActive(PotionLoader.potionGhostly)){
            player.removePotionEffect(PotionLoader.potionGhostly);
        }
    }
    @SubscribeEvent
    public static void onLivingSetAttackTargetEvent(LivingSetAttackTargetEvent event){
        EntityLivingBase target = event.getTarget();
        if( target != null && target.isPotionActive(PotionLoader.potionGhostly)){
            if(event.getEntity() instanceof EntityLiving){
                ((EntityLiving) event.getEntity()).setAttackTarget((EntityLivingBase)null);
            }
        }
    }
}
