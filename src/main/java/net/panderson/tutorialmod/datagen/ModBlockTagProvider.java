package net.panderson.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.panderson.tutorialmod.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.Rose_Gold_Block)
                .add(ModBlocks.Rough_Metal_Block)
                .add(ModBlocks.Prismatic_Metal_Block)
                .add(ModBlocks.Active_Prismatic_Metal_Block);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.Active_Prismatic_Metal_Block)
                .add(ModBlocks.Rough_Metal_Block)
                .add(ModBlocks.Prismatic_Metal_Block);
    }
}
