package net.panderson.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.panderson.tutorialmod.TutorialMod;

public class ModItems {

    public static final Item PRISMATIC_METAL = registerItem("prismatic_metal", new Item(new FabricItemSettings()));
    public static final Item Prismatic_Smithing_Template = registerItem("prismatic_smithing_template", new Item(new FabricItemSettings()));

    public static final Item Prismatic_Pickaxe = registerItem("prismatic_pickaxe",
            new PickaxeItem(ModToolMaterials.Prismatic_Metal, 1, -2.8f, new FabricItemSettings()));
    public static final Item Prismatic_Axe = registerItem("prismatic_axe",
            new AxeItem(ModToolMaterials.Prismatic_Metal, 5, -3.0f, new FabricItemSettings()));
    public static final Item Prismatic_Sword = registerItem("prismatic_sword",
            new SwordItem(ModToolMaterials.Prismatic_Metal, 3, -2.4f, new FabricItemSettings()));
    public static final Item Prismatic_Shovel = registerItem("prismatic_shovel",
            new ShovelItem(ModToolMaterials.Prismatic_Metal, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item Prismatic_Hoe = registerItem("prismatic_hoe",
            new HoeItem(ModToolMaterials.Prismatic_Metal, -4, 0.0f, new FabricItemSettings()));

    public static final Item Prismatic_Helmet = registerItem("prismatic_helmet",
            new ArmorItem(ModArmorMaterials.Prismatic, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item Prismatic_Chestplate = registerItem("prismatic_chestplate",
            new ArmorItem(ModArmorMaterials.Prismatic, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item Prismatic_Leggings = registerItem("prismatic_leggings",
            new ArmorItem(ModArmorMaterials.Prismatic, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item Prismatic_Boots = registerItem("prismatic_boots",
            new ArmorItem(ModArmorMaterials.Prismatic, ArmorItem.Type.BOOTS, new FabricItemSettings()));




    public static final Item Rose_Gold = registerItem("rose_gold", new Item(new FabricItemSettings()));
    public static final Item Rose_Gold_Smithing_Template = registerItem("rose_gold_smithing_template", new Item(new FabricItemSettings()));

    public static final Item Rose_Gold_Pickaxe = registerItem("rose_gold_pickaxe",
            new PickaxeItem(ModToolMaterials.Rose_Gold, 1, -2.8f, new FabricItemSettings()));
    public static final Item Rose_Gold_Axe = registerItem("rose_gold_axe",
            new AxeItem(ModToolMaterials.Rose_Gold, 6, -3.1f, new FabricItemSettings()));
    public static final Item Rose_Gold_Sword = registerItem("rose_gold_sword",
            new SwordItem(ModToolMaterials.Rose_Gold, 3, -2.4f, new FabricItemSettings()));
    public static final Item Rose_Gold_Shovel = registerItem("rose_gold_shovel",
            new ShovelItem(ModToolMaterials.Rose_Gold, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item Rose_Gold_Hoe = registerItem("rose_gold_hoe",
            new HoeItem(ModToolMaterials.Rose_Gold, -2, -1.0f, new FabricItemSettings()));

    public static final Item Rose_Gold_Helmet = registerItem("rose_gold_helmet",
            new ArmorItem(ModArmorMaterials.Rose_Gold, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item Rose_Gold_Chestplate = registerItem("rose_gold_chestplate",
            new ArmorItem(ModArmorMaterials.Rose_Gold, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item Rose_Gold_Leggings = registerItem("rose_gold_leggings",
            new ArmorItem(ModArmorMaterials.Rose_Gold, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item Rose_Gold_Boots = registerItem("rose_gold_boots",
            new ArmorItem(ModArmorMaterials.Rose_Gold, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item Chocolate_Bar = registerItem("chocolate_bar",
            new Item(new FabricItemSettings().food(ModFoodComponents.Chocolate_Bar)));

    public static final Item Quartz_Sword = registerItem("quartz_sword",
            new SwordItem(ModToolMaterials.Quartz, 3, -2.4f, new FabricItemSettings()));

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

