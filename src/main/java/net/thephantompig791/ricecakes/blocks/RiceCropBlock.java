package net.thephantompig791.ricecakes.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.thephantompig791.ricecakes.items.ModItems;

import javax.swing.text.html.BlockView;

public class RiceCropBlock extends CropBlock {

    private static final VoxelShape[] AGE_TO_SHAPE = new VoxelShape[]{
        Block.createCuboidShape(0.0D,0.0D,0.0D,16.0D,2.0D,16.0D),
        Block.createCuboidShape(0.0D,0.0D,0.0D,16.0D,3.0D,16.0D),
        Block.createCuboidShape(0.0D,0.0D,0.0D,16.0D,4.0D,16.0D),
        Block.createCuboidShape(0.0D,0.0D,0.0D,16.0D,5.0D,16.0D),
        Block.createCuboidShape(0.0D,0.0D,0.0D,16.0D,6.0D,16.0D),
        Block.createCuboidShape(0.0D,0.0D,0.0D,16.0D,7.0D,16.0D),
        Block.createCuboidShape(0.0D,0.0D,0.0D,16.0D,8.0D,16.0D)
    };

    public RiceCropBlock(Settings settings) {
        super(settings);
    }

    public ItemConvertible getSeedsItem() {
        return ModItems.RICE_CROP_SEEDS;
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return AGE_TO_SHAPE[(Integer)state.get(this.getAgeProperty())];
    }
}
