package com.ancientpot.tutorialmod.item;

import com.ancientpot.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class Moditems {
    public static final Item lintongjun = registerItems("lintongjun",new Item(new Item.Settings()));
    public static final Item hajimi = registerItems("hajimi",new Item(new Item.Settings()));


    private static Item registerItems(String id,Item item){
//        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(TutorialMod.MOD_ID,id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID,id), item);
    }
    public static void registerModItem(){
        TutorialMod.LOGGER.info("Registering Items");
    }
}
