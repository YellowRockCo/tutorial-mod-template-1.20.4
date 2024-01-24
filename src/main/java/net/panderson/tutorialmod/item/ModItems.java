package net.panderson.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.panderson.tutorialmod.TutorialMod;

public class ModItems {

    public static final Item PRISMATIC_METAL = registerItem("prismatic_metal", new Item(new FabricItemSettings()));
    public static final Item Rose_Gold = registerItem("rose_gold", new Item(new FabricItemSettings()));
    public static final Item Chocolate_Bar = registerItem("chocolate_bar", new Item(new FabricItemSettings().food(ModFoodComponents.Chocolate_Bar)));

    private static void addItemsToIngrediantItemGroup(FabricItemGroupEntries entries) {

        entries.add(PRISMATIC_METAL);
        entries.add(Rose_Gold);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("registering mod items for " + TutorialMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngrediantItemGroup);
    }
}

