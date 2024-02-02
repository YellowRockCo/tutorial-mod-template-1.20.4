package net.panderson.tutorialmod.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.panderson.tutorialmod.item.ModItems;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.ARMORER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 20),
                    new ItemStack(ModItems.Rose_Gold, 2),
                    new ItemStack(ModItems.Rose_Gold_Smithing_Template, 1),
            6, 2, 0.15f
            ));
        });
        {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 20),
                    new ItemStack(ModItems.Rose_Gold, 2),
                    new ItemStack(ModItems.Rose_Gold_Smithing_Template, 1),
            6, 2, 0.15f
            ));
        });
        {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 20),
                    new ItemStack(ModItems.Rose_Gold, 2),
                    new ItemStack(ModItems.Rose_Gold_Smithing_Template, 1),
            6, 2, 0.15f
            ));
        });
    }
}}}
