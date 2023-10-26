package net.freedinner.display.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.freedinner.display.init.DisplayProperties;

public class IngotBlock extends AbstractItemBlock {
	public static final IntegerProperty INGOTS = DisplayProperties.INGOTS;

	public IngotBlock(BlockBehaviour.Properties props) {
		super(props);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false).setValue(INGOTS, 1));
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> box(2, 0, 3, 14, 6, 13);
			case NORTH, SOUTH -> box(2, 0, 3, 14, 6, 13);
			case EAST, WEST -> box(3, 0, 2, 13, 6, 14);
		};
	}

	@Override
	public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
		ItemStack stack = player.getItemInHand(hand);
		int i = state.getValue(INGOTS);
		if (stack.is(ItemTags.create(new ResourceLocation("forge:ingots")))) {
			if (world.isClientSide() && i < 3) {
				return InteractionResult.SUCCESS;
			} else if (stack.getItem() == this.getStackFor().getItem() && i < 3) {
				world.setBlock(pos, this.defaultBlockState().setValue(FACING, state.getValue(FACING)).setValue(WATERLOGGED, state.getValue(WATERLOGGED)).setValue(INGOTS, Integer.valueOf(i + 1)), 2);
				if (world instanceof ServerLevel lvl) {
					lvl.playSound(null, pos, state.getSoundType(world, pos, player).getPlaceSound(), SoundSource.BLOCKS, 1.0F, (float) (0.8F + (Math.random() * 0.2)));
				}
				if (!player.isCreative()) {
					stack.shrink(1);
				}
				return InteractionResult.SUCCESS;
			}
		}
		return InteractionResult.FAIL;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(INGOTS);
	}
}