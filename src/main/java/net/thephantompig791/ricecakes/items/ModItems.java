package net.thephantompig791.ricecakes.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.thephantompig791.ricecakes.Ricecakes;
import net.thephantompig791.ricecakes.blocks.ModBlocks;
import net.thephantompig791.ricecakes.items.itemtypes.RainbowRiceItem;

public class ModItems {

    public static final Item ROUGH_RICE = registerItem("rough_rice",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 10, 0), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 0), 0.1f).statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 100, 0), 0.5f).build())));

    public static final Item BROWN_RICE = registerItem("brown_rice",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(1).snack().build())));

    public static final Item RICE = registerItem("rice",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(2).snack().build())));

    public static final Item RAINBOW_RICE = registerItem("rainbow_rice",
            new RainbowRiceItem(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(5).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 100, 0), 1f).build())));

    public static final Item RICE_CROP_SEEDS = registerItem("rice_crop_seeds",
            new AliasedBlockItem(ModBlocks.RICE_CROP_BLOCK, new Item.Settings().group(ItemGroup.MISC)));

    public static final Item RAW_RICE_CAKE = registerItem("raw_rice_cake",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(2).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 2), 0.9f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 2), 0.5f).build())));

    public static final Item RICE_CAKE = registerItem("rice_cake",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(3f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1, 0), 1f).build())));

    public static final Item RICE_CAKE_BLOCK = registerItem("rice_cake_block",
            new AliasedBlockItem(ModBlocks.RICE_CAKE_BLOCK, new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(20).saturationModifier(20).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 300, 4), 0.7f).build())));

    public static final Item RAW_FRIED_RICE = registerItem("raw_fried_rice",
            new StewItem(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(26).saturationModifier(2).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 2), 0.7f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 2), 0.3f).build())));

    public static final Item FRIED_RICE = registerItem("fried_rice",
            new StewItem(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(18).saturationModifier(20).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 20, 9), 0.9f).build())));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Ricecakes.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Ricecakes.LOGGER.info("Registering the " + Ricecakes.MOD_ID + "!");
    }
}
