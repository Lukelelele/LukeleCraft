package com.lukele.lukelecraft.util;

import com.lukele.lukelecraft.LukeleCraftMain;
import com.lukele.lukelecraft.client.render.DesertSettlerRenderer;
import com.lukele.lukelecraft.client.render.experimental.EvilRenderer;
import com.lukele.lukelecraft.client.render.experimental.TestRenderer;
import com.lukele.lukelecraft.init.ModEntityTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = LukeleCraftMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event){
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TEST.get(), TestRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.EVIL.get(), EvilRenderer::new);

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.DESERTSETTLER.get(), DesertSettlerRenderer::new);
    }



}
