package net.thephantompig791.ricecakes.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thephantompig791.ricecakes.Ricecakes;

public class ModItems {

    public static final Item RICE_CAKE = registerItem("rice_cake",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(3f).snack().build())));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Ricecakes.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Ricecakes.LOGGER.info("Registering the " + Ricecakes.MOD_ID + "!");
    }

}
