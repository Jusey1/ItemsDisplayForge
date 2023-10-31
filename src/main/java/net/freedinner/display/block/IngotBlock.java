package net.freedinner.display.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class IngotBlock extends AbstractStackableBlock {
	public IngotBlock(BlockBehaviour.Properties props) {
		super(props);
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
	public int getMaxStackable() {
		return 3;
	}
}