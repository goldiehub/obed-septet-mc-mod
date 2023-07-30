package com.kawaiisex;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static SoundEvent DILDO_BOING1 = registerSoundEvent("dildoboing1");
    public static SoundEvent DILDO_BOING2 = registerSoundEvent("dildoboing2");

    private static SoundEvent registerSoundEvent(String name)
    {
        Identifier id = new Identifier(ObedSeptetMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerModSounds() {
        ObedSeptetMod.LOGGER.info("Registering Mod Items for " + ObedSeptetMod.MOD_ID);
    }
}
