package com.lukele.lukelecraft.events;

import com.lukele.lukelecraft.LukeleCraftMain;
import com.lukele.lukelecraft.init.ModBlocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = LukeleCraftMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void onJumpWithStick(LivingEvent.LivingJumpEvent event) {
        LivingEntity player = event.getEntityLiving();
        if (player.getHeldItemMainhand().getItem() == Items.STICK) {
        LukeleCraftMain.LOGGER.info("Player tried to jump with a stick!");
            World world = player.getEntityWorld();
            world.setBlockState(player.getPosition().add( 0, -1, 0), ModBlocks.RUBY_BLOCK.get().getDefaultState()); //Changed getPosition() -> func_233580_cy_
        }
    }
}
