package fr.mcopvp.mcopvp.init;

import cpw.mods.fml.common.registry.GameRegistry;
import fr.mcopvp.mcopvp.References;
import fr.mcopvp.mcopvp.blocks.blockBasique;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class blockMod {

    public static Block jade_ore, jade_block;
    public static Block crystal_ore, crystal_block;
    public static Block tin_ore;

    public static void init(){
        jade_ore = new blockBasique(Material.rock).setBlockName("jade_ore").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(References.MODID + ":jade_ore").setHardness(3).setResistance(20.0f);
        jade_block = new blockBasique(Material.rock).setBlockName("jade_block").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(References.MODID + ":jade_block").setHardness(3).setResistance(20.0f);
        crystal_ore = new blockBasique(Material.rock).setBlockName("crystal_ore").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(References.MODID + ":crystal_ore").setHardness(3).setResistance(20.0f);
        tin_ore = new blockBasique(Material.rock).setBlockName("tin_Ore").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(References.MODID + ":tin_ore").setHardness(3).setResistance(20.00f);
    }
    public static void register(){
        GameRegistry.registerBlock(jade_ore, jade_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(jade_block, jade_block.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(crystal_ore, crystal_ore.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(tin_ore, tin_ore.getUnlocalizedName().substring(5));
    }
}
