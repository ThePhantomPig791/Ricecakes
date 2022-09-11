package net.thephantompig791.ricecakes.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thephantompig791.ricecakes.Ricecakes;

public class ModBlocks {

    public static final Block RICE_CAKE_BLOCK = registerBlock("rice_cake_block",
            new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(0.1f).breakInstantly()));

    public static final CropBlock RICE_CROP_BLOCK = new RiceCropBlock(AbstractBlock.Settings.of(Material.PLANT).nonOpaque().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Ricecakes.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        Ricecakes.LOGGER.info("Registering the rice blocks!");

        Registry.register(Registry.BLOCK, new Identifier("ricecakes", "rice_crop_seeds"), RICE_CROP_BLOCK);
    }
}
