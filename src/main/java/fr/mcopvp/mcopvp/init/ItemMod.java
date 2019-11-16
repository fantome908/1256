package fr.mcopvp.mcopvp.init;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.mcopvp.mcopvp.References;
import net.minecraft.item.Item;

public class ItemMod {

// je sais pas si sa fonction  XD
    public static Item Jade;

    public static void (Jade){
        GameRegistry.registerItem (Jade);
    }
    public static void (Jade){

        Item jade = Jade = new.setBlockName("Jade").setBlockTextureName(References.MODID + ":jade");

    }
}
    @SideOnly(Side.CLIENT)
    private static void registerItemModels(){
        ModelLoader.setCustomModelResourceLocation (Jade , 0, new ModelResourceLocation.(Jade.02255 + ":Jade", "inventory"));


}
