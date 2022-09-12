package net.thephantompig791.ricecakes.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetContentsLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.thephantompig791.ricecakes.items.ModItems;

public class ModLootTablesModifiers {

    private static final Identifier VILLAGE_SAVANNA_HOUSE_LOOT_TABLE_ID
            =new Identifier("minecraft", "chests/village/village_savanna_house");


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (VILLAGE_SAVANNA_HOUSE_LOOT_TABLE_ID.equals(id)) {
                LootPool poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(2))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.RICE_CROP_SEEDS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)))
                                .build();
                tableBuilder.pool(poolBuilder);
            }
        });
    }
}
