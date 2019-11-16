package fr.mcopvp.mcopvp.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class blockBasique extends Block {
    private Item drop;

    public blockBasique(Material p_i45394_1_, Item drop) {
        super(p_i45394_1_);
        this.drop = drop;
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(int metadata, Random rand, int fortuneLevel) {
        return this.drop;
    }
}
