package fr.mcopvp.mcopvp.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blockBasiqueNoItem extends Block {

    public blockBasiqueNoItem(Material p_i45394_1_) {
        super(p_i45394_1_);
        this.setHarvestLevel("pickaxe", 2);
    }
}
