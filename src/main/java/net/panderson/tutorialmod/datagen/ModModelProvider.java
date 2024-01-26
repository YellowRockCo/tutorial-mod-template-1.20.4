package net.panderson.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.panderson.tutorialmod.block.ModBlocks;
import net.panderson.tutorialmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PRISMATIC_METAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.Prismatic_Smithing_Template, Models.GENERATED);
        itemModelGenerator.register(ModItems.Rose_Gold, Models.GENERATED);
        itemModelGenerator.register(ModItems.Rose_Gold_Smithing_Template, Models.GENERATED);
        itemModelGenerator.register(ModItems.Chocolate_Bar, Models.GENERATED);

        itemModelGenerator.register(ModItems.Rose_Gold_Axe, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Rose_Gold_Pickaxe, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Rose_Gold_Shovel, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Rose_Gold_Sword, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Rose_Gold_Hoe, Models.HANDHELD);

        itemModelGenerator.register(ModItems.Prismatic_Axe, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Prismatic_Pickaxe, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Prismatic_Shovel, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Prismatic_Sword, Models.HANDHELD);
        itemModelGenerator.register(ModItems.Prismatic_Hoe, Models.HANDHELD);
    }
}
