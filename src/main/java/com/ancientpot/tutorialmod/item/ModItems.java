package com.ancientpot.tutorialmod.item;

import com.ancientpot.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
// 物品实例定义:在这里声明并初始化具体的物品对象
    public static final Item TUTORIAL_ITEM = registerItems("tutorial_item",new Item(new Item.Settings()));
    public static final Item ZHANGXIN = registerItems("zhangxin",new Item(new Item.Settings()));
    public static final Item LANXI = registerItems("lanxi",new Item(new Item.Settings()));
    public static final Item LINTONGJUN = registerItems("lintongjun",new Item(new Item.Settings()));
    public static final Item XUANGE = registerItems("xuange",new Item(new Item.Settings()));
// 物品注册辅助方法:这是一个私有静态方法，用于简化向注册表添加物品的过程
    private static Item registerItems(String id,Item item){
//      return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(TutorialMod.MOD_ID,id)), item);
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID,id), item);
    }
// 向默认创造模式物品组添加物品:此方法将被回调，用于将自定义物品添加到指定的原版物品组
//    private static void addItemToIG(FabricItemGroupEntries fabricItemGroupEntries){
//        fabricItemGroupEntries.add(lintongjun);
//    }
// 注册物品组事件监听器:这是初始化的入口方法，需要在 Mod 初始化阶段被调用
    public static void registerModItem(){
//      ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditems::addItemToIG);
        TutorialMod.LOGGER.info("注册物品初始化完成");
    }
}
