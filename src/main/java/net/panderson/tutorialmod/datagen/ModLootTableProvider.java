package net.panderson.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.panderson.tutorialmod.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.Prismatic_Metal_Block);
        addDrop(ModBlocks.Active_Prismatic_Metal_Block);
        addDrop(ModBlocks.Rough_Metal_Block);
        addDrop(ModBlocks.Rose_Gold_Block);
    }
}
