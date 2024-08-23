package net.freedinner.display.block;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.Direction;
import net.freedinner.display.init.DisplayProperties;

public abstract class AbstractStackableBlock extends AbstractItemBlock {
	public static final IntegerProperty STACKS = DisplayProperties.STACKS;

	public AbstractStackableBlock(BlockBehaviour.Properties props) {
		super(props);
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(WATERLOGGED, false).setValue(STACKS, 1));
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(STACKS);
	}

	public int getStacks(BlockState state) {
		return state.getValue(STACKS);
	}

	public BlockState getState(BlockState state) {
		return state.setValue(STACKS, this.getStacks(state) + 1);
	}

	public abstract int getMaxStackable();
}