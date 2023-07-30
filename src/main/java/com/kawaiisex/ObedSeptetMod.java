package com.kawaiisex;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObedSeptetMod implements ModInitializer {
	public static final String MOD_ID = "obedseptet";
    public static final Logger LOGGER = LoggerFactory.getLogger("obedseptet");
	public static final DildoSword DSWORD = new DildoSword(new FabricItemSettings().maxCount(1));

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
	    content.add(DSWORD);});
		ModSounds.registerModSounds();
		Registry.register(Registries.ITEM, new Identifier("obedseptet", "dildo-sword"), DSWORD);
	}
}