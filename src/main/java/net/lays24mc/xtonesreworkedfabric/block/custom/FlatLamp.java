package net.lays24mc.xtonesreworkedfabric.block.custom;

import com.mojang.serialization.MapCodec;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.RedstoneTorchBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class FlatLamp extends FacingBlock {

  public static final MapCodec<? extends FacingBlock> CODEC = createCodec(FlatLamp::new);
  public static final BooleanProperty LIT;
  public static final IntProperty LUMINANCE = IntProperty.of("luminance", 0, 15);

  private static final VoxelShape SHAPE_DOWN = VoxelShapes.cuboid(0.0f, 0.82f, 0.0f, 1.0f, 1.0f, 1.0f);
  private static final VoxelShape SHAPE_UP = VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 0.18f, 1.0f);
  private static final VoxelShape SHAPE_WEST = VoxelShapes.cuboid(0.82f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
  private static final VoxelShape SHAPE_EAST = VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 0.18f, 1.0f, 1.0f);
  private static final VoxelShape SHAPE_NORTH = VoxelShapes.cuboid(0.0f, 0.0f, 0.82f, 1.0f, 1.0f, 1.0f);
  private static final VoxelShape SHAPE_SOUTH = VoxelShapes.cuboid(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.18f);

  public FlatLamp(Settings settings) {
    super(settings.luminance(state -> state.get(LUMINANCE)));
    setDefaultState(getDefaultState().with(Properties.FACING, Direction.UP).with(LIT, false).with(LUMINANCE, 0));
  }

  @Override
  protected MapCodec<? extends FacingBlock> getCodec() {
    return CODEC;
  }

  @Override
  protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
    builder.add(Properties.FACING, Properties.LIT, LUMINANCE);
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
    return super.getPlacementState(ctx).with(Properties.FACING, ctx.getPlayerLookDirection().getOpposite()).with(LIT,
        ctx.getWorld().isReceivingRedstonePower(ctx.getBlockPos()));
  }

  protected void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos,
      boolean notify) {
    if (!world.isClient) {
      boolean bl = (Boolean) state.get(LIT);
      if (bl != world.isReceivingRedstonePower(pos)) {
        if (bl) {
          world.scheduleBlockTick(pos, this, 4);
        } else {
          world.setBlockState(pos, (BlockState) state.cycle(LIT).with(LUMINANCE, state.get(LIT) ? 0 : 15), 3);
        }
      }
    }
  }

  protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
    if ((Boolean) state.get(LIT) && !world.isReceivingRedstonePower(pos)) {
      world.setBlockState(pos, (BlockState) state.cycle(LIT).with(LUMINANCE, state.get(LIT) ? 0 : 15), 3);

    }

  }

  static {
    LIT = RedstoneTorchBlock.LIT;
  }

}
