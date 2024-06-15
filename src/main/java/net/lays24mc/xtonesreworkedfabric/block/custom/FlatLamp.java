package net.lays24mc.xtonesreworkedfabric.block.custom;

import com.mojang.serialization.MapCodec;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class FlatLamp extends FacingBlock {

  private static final VoxelShape SHAPE_DOWN = VoxelShapes.cuboid(0.0f, 0.82f, 0.0f, 1.0f, 1.0f, 1.0f);
  private static final VoxelShape SHAPE_UP = VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 0.18f, 1.0f);
  private static final VoxelShape SHAPE_WEST = VoxelShapes.cuboid(0.82f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f); //ok
  private static final VoxelShape SHAPE_EAST = VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 0.18f, 1.0f, 1.0f); //ok
  private static final VoxelShape SHAPE_NORTH = VoxelShapes.cuboid(0.0f, 0.0f, 0.82f, 1.0f, 1.0f, 1.0f);
  private static final VoxelShape SHAPE_SOUTH = VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.18f);

  public FlatLamp(Settings settings) {
    super(settings);
    setDefaultState(getDefaultState().with(Properties.FACING, Direction.UP));
  }
  
  @Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(Properties.FACING);
	}

  
  @Override
  public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
    Direction dir = state.get(FACING);
    switch (dir) {
      case NORTH:
        return SHAPE_NORTH;
      case SOUTH:
        return SHAPE_SOUTH;
      case EAST:
        return SHAPE_EAST;
      case WEST:
        return SHAPE_WEST;
      case UP:
        return SHAPE_UP;
      case DOWN:
        return SHAPE_DOWN;
      default:
        return VoxelShapes.fullCube();
    }
  }

  @Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return super.getPlacementState(ctx).with(Properties.FACING, ctx.getPlayerLookDirection().getOpposite());
	}

  @Override
  protected MapCodec<? extends FacingBlock> getCodec() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getCodec'");
  }
  
}
