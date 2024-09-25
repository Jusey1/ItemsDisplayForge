package net.freedinner.display.block;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class ArmorTrimBlock extends AbstractItemBlock implements IDisplayBlock, IPillowBlock {
	public ArmorTrimBlock(BlockBehaviour.Properties props) {
		super(props);
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> box(4, 0, 2, 12, 4, 14);
			case NORTH, SOUTH -> box(4, 0, 2, 12, 4, 14);
			case EAST, WEST -> box(2, 0, 4, 14, 4, 12);
		};
	}
}