package net.panderson.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.panderson.tutorialmod.TutorialMod;

public class ModItemGroups {

    public static final ItemGroup Ingot_Group = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TutorialMod.MOD_ID, "Ingot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.Ingot"))
                    .icon(() -> new ItemStack(ModItems.PRISMATIC_METAL)).entries((displayContext, entries) -> {

                    entries.add(ModItems.PRISMATIC_METAL);
                    entries.add(ModItems.Rose_Gold);

                    }).build());
    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("registering item groups for " + TutorialMod.MOD_ID);
    }
}
