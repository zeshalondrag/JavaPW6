package net.zeshalondrag.sapphiremod.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.zeshalondrag.sapphiremod.SapphireMod;
import net.zeshalondrag.sapphiremod.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier SAPPHIRE = TierSortingRegistry.registerTier(
            new ForgeTier(2,250,6f,2f,14,
                    ModTags.Blocks.NEEDS_SAPPHIRE_TOOL, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(SapphireMod.MOD_ID, "sapphire"), List.of(Tiers.IRON), List.of());

}