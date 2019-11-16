package fr.mcopvp.mcopvp;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import fr.mcopvp.mcopvp.init.ItemMod;
import fr.mcopvp.mcopvp.init.blockMod;
import fr.mcopvp.mcopvp.proxy.commonProxy;
import fr.mcopvp.mcopvp.world.WorldRegister;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.opengl.Display;

@Mod(modid = References.MODID, name = References.MODNAME, version = References.VERSION)
public class MainMod {
    public static boolean ready = false;

    @Mod.Instance(References.MODID)
    public static MainMod instance;

    @SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY)
    public static commonProxy proxy;

    public static EntityPlayer player;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ready = true;
        Display.setTitle("|| MCO-PVP || MINECRAFT PVP FACTION ||");
        ItemMod.init();
        ItemMod.register();
        blockMod.init();
        blockMod.register();
        WorldRegister.mainRegistry();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){}
}
