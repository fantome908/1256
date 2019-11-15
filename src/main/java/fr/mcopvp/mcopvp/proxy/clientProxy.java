package fr.mcopvp.mcopvp.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;

public class clientProxy extends commonProxy {
    private static EntityPlayer player;

    public clientProxy(){
        MinecraftForge.EVENT_BUS.register(this);
    }
}
