package com.ancientpot.tutorialmod.block;

import com.ancientpot.tutorialmod.TutorialMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block TUTORIAL_BLOCK =  register("tutorial_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(0.2f,5.0f)));
    public static final Block ZHANGXIN_BLOCK =  register("zhangxin_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(0.2f,5.0f)));
    public static final Block LANXI_BLOCK =  register("lanxi_block", new Block(AbstractBlock.Settings.create().requiresTool().strength(0.2f,5.0f)));
    public static final Block LINTONGJUN_BLOCK =  register("lintongjun_block", new Block(AbstractBlock.Settings.create().strength(0.2f,5.0f)));
    public static final Block XUANGE_BLOCK =  register("xuange_block", new Block(AbstractBlock.Settings.create().strength(0.2f,5.0f)));


    public static  void registerBlockItems(String id, Block block) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }
    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, id), block);
    }
    public static void registerModBlocks(){
        TutorialMod.LOGGER.info("注册方块初始化完成");
    }
}
