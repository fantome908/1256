package fr.mcopvp.mcopvp.blocks;

import fr.mcopvp.mcopvp.init.ItemMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class blockBasique extends Block {
    public Item drop;

    public blockBasique(Material p_i45394_1_, Item drop_item) {
        super(p_i45394_1_);
        drop = drop_item;
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public Item getItemDropped(int metadata, Random rand, int fortuneLevel) {
        return drop;
    }
}
