package net.panderson.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.panderson.tutorialmod.block.ModBlocks;
import net.panderson.tutorialmod.item.ModItemGroups;
import net.panderson.tutorialmod.item.ModItems;
import net.panderson.tutorialmod.util.ModCustomTrades;
import net.panderson.tutorialmod.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
    public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();
		ModCustomTrades.registerCustomTrades();
	}
}