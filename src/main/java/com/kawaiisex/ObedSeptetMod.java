package com.kawaiisex;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObedSeptetMod implements ModInitializer {
	public static final String MOD_ID = "obedseptet";
    public static final Logger LOGGER = LoggerFactory.getLogger("obedseptet");
	public static final ToolItem DSWORD = new SwordItem(Material.INSTANCE, 9, -2.4F, new Item.Settings());

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
	    content.add(DSWORD);});
		ModSounds.registerModSounds();
		Registry.register(Registries.ITEM, new Identifier("obedseptet", "dildo-sword"), DSWORD);
		AttackEntityCallback.EVENT.register(new SoundOnHit());
	}
}