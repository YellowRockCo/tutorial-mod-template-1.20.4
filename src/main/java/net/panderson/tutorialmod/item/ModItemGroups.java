package net.panderson.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.panderson.tutorialmod.TutorialMod;
import net.panderson.tutorialmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup Ingot_Group = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "ingot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ingot"))
                    .icon(() -> new ItemStack(ModItems.PRISMATIC_METAL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PRISMATIC_METAL);
                        entries.add(ModItems.Rose_Gold);

                        entries.add(ModBlocks.Prismatic_Metal_Block);
                        entries.add(ModBlocks.Rough_Metal_Block);
                        entries.add(ModBlocks.Active_Prismatic_Metal_Block);
                        entries.add(ModBlocks.Rose_Gold_Block);

                    }).build());
    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("registering item groups for " + TutorialMod.MOD_ID);
    }
}
