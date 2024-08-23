package net.freedinner.display.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class IngotBlock extends AbstractStackableBlock {
	public IngotBlock(BlockBehaviour.Properties props) {
		super(props);
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		int i = this.getStacks(state);
		return switch (i) {
			case 1 -> switch (state.getValue(FACING)) {
				case NORTH, SOUTH -> box(5.5, 0, 3, 10.5, 3, 13);
				case EAST, WEST -> box(3, 0, 5.5, 13, 3, 10.5);
				default -> box(1, 0, 1, 15, 3, 15);
			};
			case 2 -> switch (state.getValue(FACING)) {
				case NORTH, SOUTH -> box(1, 0, 2, 15, 3, 14);
				case EAST, WEST -> box(2, 0, 1, 14, 3, 15);
				default -> box(1, 0, 1, 15, 3, 15);
			};
			case 3 -> switch (state.getValue(FACING)) {
				case NORTH, SOUTH -> box(2, 0, 3, 14, 6, 13);
				case EAST, WEST -> box(3, 0, 2, 13, 6, 14);
				default -> box(1, 0, 1, 15, 6, 15);
			};
			default -> box(1, 0, 1, 15, 6, 15);
		};
	}

	@Override
	public int getMaxStackable() {
		return 3;
	}
}