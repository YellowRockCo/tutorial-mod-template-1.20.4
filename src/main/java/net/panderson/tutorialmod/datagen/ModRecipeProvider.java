package net.panderson.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.panderson.tutorialmod.block.ModBlocks;
import net.panderson.tutorialmod.item.ModItems;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> Rough_Metal = List.of(ModBlocks.Rough_Metal_Block);


    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, Rough_Metal, RecipeCategory.MISC, ModItems.PRISMATIC_METAL,
              1.0f,  200, "Metal");
        offerBlasting(exporter, Rough_Metal, RecipeCategory.MISC, ModItems.PRISMATIC_METAL,
              1.0f,  100, "Metal");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PRISMATIC_METAL, RecipeCategory.MISC, ModBlocks.Prismatic_Metal_Block);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.Rose_Gold, RecipeCategory.MISC, ModBlocks.Rose_Gold_Block);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.Rose_Gold, RecipeCategory.MISC, ModBlocks.Rose_Gold_Block);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.Rose_Gold, 4)
                .input(Items.GOLD_INGOT)
                .input(Items.GOLD_INGOT)
                .input(Items.GOLD_INGOT)
                .input(Items.GOLD_INGOT)
                .input(Items.COPPER_INGOT)
                .input(Items.COPPER_INGOT)
                .input(Items.COPPER_INGOT)
                .input(Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.Rose_Gold)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.Chocolate_Bar, 4)
                .input(Items.SUGAR)
                .input(Items.SUGAR)
                .input(Items.COCOA_BEANS)
                .input(Items.COCOA_BEANS)
                .input(Items.MILK_BUCKET)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.Chocolate_Bar)));
    }
}
