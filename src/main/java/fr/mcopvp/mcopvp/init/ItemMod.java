package fr.mcopvp.mcopvp.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.mcopvp.mcopvp.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMod {

// je sais pas si sa fonction  XD
    public static Item Jade, crystal;

    public static void init(){
        Jade = new Item().setUnlocalizedName("jade").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(References.MODID + ":jade");
        crystal = new Item().setUnlocalizedName("crystal").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(References.MODID + ":crystal");
    }

    public static void register(){
        GameRegistry.registerItem(Jade, "jade");
        GameRegistry.registerItem(crystal, "crystal");
    }

}