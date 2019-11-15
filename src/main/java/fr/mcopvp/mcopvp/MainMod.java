package fr.mcopvp.mcopvp;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;

@Mod(modid = References.MODID, name = References.MODNAME, version = References.VERSION)
public class MainMod {
    public static boolean ready = false;

    @Mod.Instance(References.MODID)
    public static MainMod instance;

    @SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY)
    public static commonProxy proxy;

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void onTick(TickEvent.ClientTickEvent event) {}

    public static EntityPlayer player;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        String configDir = event.getModConfigurationDirectory().toString();
        ConfigurationHandler.init(configDir);
    }
}
