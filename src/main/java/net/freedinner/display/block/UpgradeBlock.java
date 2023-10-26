package net.freedinner.display.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class UpgradeBlock extends AbstractItemBlock {
	public UpgradeBlock(BlockBehaviour.Properties props) {
		super(props);
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> box(3.5, 0, 2, 12.5, 4, 14);
			case NORTH, SOUTH -> box(3.5, 0, 2, 12.5, 4, 14);
			case EAST, WEST -> box(2, 0, 3.5, 14, 4, 12.5);
		};
	}
}