package net.freedinner.display.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class GemBlock extends AbstractStackableBlock {
	public GemBlock(BlockBehaviour.Properties props) {
		super(props);
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		int i = this.getStacks(state);
		return switch (i) {
			case 1 -> switch (state.getValue(FACING)) {
				case NORTH, SOUTH -> box(6, 0, 5, 10, 2, 11);
				case EAST, WEST -> box(5, 0, 6, 11, 2, 10);
				default -> box(1, 0, 1, 15, 2, 15);
			};
			case 2 -> box(2, 0, 2, 14, 2, 14);
			case 3 -> box(1, 0, 1, 15, 2, 15);
			case 4 -> box(1, 0, 1, 15, 4, 15);
			default -> box(1, 0, 1, 15, 4, 15);
		};
	}

	@Override
	public int getMaxStackable() {
		return 4;
	}
}