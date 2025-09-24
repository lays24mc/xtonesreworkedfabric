package net.lays24mc.xtonesreworkedfabric.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.block.WireOrientation;
import org.jetbrains.annotations.Nullable;

public class FlatLamp extends Block {

    public static final BooleanProperty LIT = Properties.LIT;
    public static final EnumProperty<Direction> FACING = Properties.FACING;

    private static final VoxelShape SHAPE_DOWN = VoxelShapes.cuboid(0.0f, 0.82f, 0.0f, 1.0f, 1.0f, 1.0f);
    private static final VoxelShape SHAPE_UP = VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 0.18f, 1.0f);
    private static final VoxelShape SHAPE_WEST = VoxelShapes.cuboid(0.82f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    private static final VoxelShape SHAPE_EAST = VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 0.18f, 1.0f, 1.0f);
    private static final VoxelShape SHAPE_NORTH = VoxelShapes.cuboid(0.0f, 0.0f, 0.82f, 1.0f, 1.0f, 1.0f);
    private static final VoxelShape SHAPE_SOUTH = VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.18f);

    public FlatLamp(Settings settings) {
        super(settings.luminance(state -> state.get(LIT) ? 15 : 0).nonOpaque());
        setDefaultState(this.stateManager.getDefaultState()
                .with(FACING, Direction.UP)
                .with(LIT, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, LIT);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        return switch (state.get(FACING)) {
            case NORTH -> SHAPE_NORTH;
            case SOUTH -> SHAPE_SOUTH;
            case EAST -> SHAPE_EAST;
            case WEST -> SHAPE_WEST;
            case UP -> SHAPE_UP;
            case DOWN -> SHAPE_DOWN;
        };
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        boolean powered = ctx.getWorld().isReceivingRedstonePower(ctx.getBlockPos());
        return this.getDefaultState()
                .with(FACING, ctx.getPlayerLookDirection().getOpposite())
                .with(LIT, powered);
    }

    @Override
    protected void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, @Nullable WireOrientation wireOrientation, boolean notify) {
        if (!world.isClient) {
            boolean powered = world.isReceivingRedstonePower(pos);
            if (state.get(LIT) != powered) {
                world.setBlockState(pos, state.with(LIT, powered), Block.NOTIFY_ALL);
            }
        }
    }
}
