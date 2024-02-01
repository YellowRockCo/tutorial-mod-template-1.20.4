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
                        entries.add(ModItems.Prismatic_Smithing_Template);
                        entries.add(ModItems.Prismatic_Sword);
                        entries.add(ModItems.Prismatic_Axe);
                        entries.add(ModItems.Prismatic_Pickaxe);
                        entries.add(ModItems.Prismatic_Shovel);
                        entries.add(ModItems.Prismatic_Hoe);

                        entries.add(ModItems.Prismatic_Helmet);
                        entries.add(ModItems.Prismatic_Chestplate);
                        entries.add(ModItems.Prismatic_Leggings);
                        entries.add(ModItems.Prismatic_Boots);

                        entries.add(ModItems.Rose_Gold);
                        entries.add(ModItems.Rose_Gold_Smithing_Template);
                        entries.add(ModItems.Rose_Gold_Sword);
                        entries.add(ModItems.Rose_Gold_Axe);
                        entries.add(ModItems.Rose_Gold_Pickaxe);
                        entries.add(ModItems.Rose_Gold_Shovel);
                        entries.add(ModItems.Rose_Gold_Hoe);

                        entries.add(ModItems.Rose_Gold_Helmet);
                        entries.add(ModItems.Rose_Gold_Chestplate);
                        entries.add(ModItems.Rose_Gold_Leggings);
                        entries.add(ModItems.Rose_Gold_Boots);

                        entries.add(ModItems.Quartz_Sword);

                        entries.add(ModItems.Chocolate_Bar);

                        entries.add(ModBlocks.Prismatic_Metal_Block);
                        entries.add(ModBlocks.Rough_Metal_Block);
                        entries.add(ModBlocks.Active_Prismatic_Metal_Block);
                        entries.add(ModBlocks.Rose_Gold_Block);

                    }).build());
    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("registering item groups for " + TutorialMod.MOD_ID);
    }
}
