package com.ancientpot.tutorialmod.item;

import com.ancientpot.tutorialmod.TutorialMod;
import com.ancientpot.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
//    public static final RegistryKey<ItemGroup> TUTORIAL_GROUP = register("tutorial_group");
//    private static RegistryKey<ItemGroup> register(String id) {
//        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(TutorialMod.MOD_ID,id));
//    }
//    public static void registerModItemGroups(){
//        Registry.register(Registries.ITEM_GROUP,TUTORIAL_GROUP,
//                ItemGroup.create(ItemGroup.Row.TOP,7)
//                        .displayName(Text.translatable("itemGroup.tutorial_group"))
//                        .icon(() -> new ItemStack(Moditems.tutorial_item))
//                        .entries((displayContext, entries) ->{
//                            entries.add(Moditems.tutorial_item);
//                        })
//                        .build()
//        );
//        TutorialMod.LOGGER.info("注册物品栏");
//    }
    public static final ItemGroup TUTORIAL_GROUP = Registry.register(Registries.ITEM_GROUP,Identifier.of(TutorialMod.MOD_ID,"tutorial_group"),
        ItemGroup.create(null,-1).displayName(Text.translatable("itemGroup.tutorial_group"))
                .icon(() -> new ItemStack(ModItems.TUTORIAL_ITEM))
                .entries((displayContext, entries) -> {
                    // 向自定义物品栏中加入物品
                    entries.add(ModItems.TUTORIAL_ITEM);
                    entries.add(ModItems.ZHANGXIN);
                    entries.add(ModItems.LANXI);
                    entries.add(ModItems.LINTONGJUN);
                    entries.add(ModItems.XUANGE);
                    entries.add(ModBlocks.TUTORIAL_BLOCK);
                    entries.add(ModBlocks.ZHANGXIN_BLOCK);
                    entries.add(ModBlocks.LANXI_BLOCK);
                    entries.add(ModBlocks.LINTONGJUN_BLOCK);
                    entries.add(ModBlocks.XUANGE_BLOCK);
                }).build());
    public static void registerModItemGroups(){
        TutorialMod.LOGGER.info("注册物品组初始化完成");
    }
}
