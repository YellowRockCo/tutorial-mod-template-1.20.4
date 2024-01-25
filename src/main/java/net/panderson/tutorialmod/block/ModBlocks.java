package net.panderson.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.panderson.tutorialmod.TutorialMod;

public class ModBlocks {
    public static final Block Prismatic_Metal_Block = registerBlock("prismatic_metal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK)));
    public static final Block Rose_Gold_Block = registerBlock("rose_gold_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK)));
    public static final Block Active_Prismatic_Metal_Block = registerBlock("active_prismatic_metal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).luminance(5)));
    public static final Block Rough_Metal_Block = registerBlock("rough_metal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name ), block);
    }

    private static Item registerBlockItem(String name, Block block) {
    return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
}


    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering Mod Blocks for " + TutorialMod.MOD_ID);
    }
}
