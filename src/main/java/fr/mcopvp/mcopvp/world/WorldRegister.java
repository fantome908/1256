package fr.mcopvp.mcopvp.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldRegister {
    public static void mainRegistry(){
        registerWorldGen(new WorldGen(), -1);
        registerWorldGen(new WorldGen(), 0);
        registerWorldGen(new WorldGen(), 1);
    }

    public static void registerWorldGen(IWorldGenerator iGenerator, int probability){
        GameRegistry.registerWorldGenerator(iGenerator, probability);
    }
}
