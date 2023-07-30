package com.kawaiisex;

import java.util.Random;
import org.jetbrains.annotations.Nullable;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

public class SoundOnHit implements AttackEntityCallback {
    Random random = new Random();
    @Override
    public ActionResult interact(PlayerEntity player, World world, Hand hand, Entity entity, @Nullable EntityHitResult hitResult)
    {
        player.sendMessage(Text.literal("dick"));
        player.playSound(random.nextBoolean() ? ModSounds.DILDO_BOING1 : ModSounds.DILDO_BOING2, 1.0F, 1.0F);
        return ActionResult.PASS;
    }
}
