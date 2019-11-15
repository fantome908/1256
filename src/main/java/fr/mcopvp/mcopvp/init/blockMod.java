package fr.mcopvp.mcopvp.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.mcopvp.mcopvp.References;
import fr.mcopvp.mcopvp.blocks.blockBasique;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockMod {

    public static Block jade_ore;

    public static void init(){
        jade_ore = new blockBasique(Material.rock).setBlockName("jade_ore").setCreativeTab(CreativeTabs.tabBlock).setBlockName(References.MODID + ":jade_ore").setHardness(3).setResistance(20.0f);
    }

    public static void register(){
        GameRegistry.registerBlock(jade_ore, jade_ore.getUnlocalizedName().substring(5));
    }
}
