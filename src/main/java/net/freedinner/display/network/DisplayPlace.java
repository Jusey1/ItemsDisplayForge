package net.freedinner.display.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.freedinner.display.events.DisplayManager;
import java.util.function.Supplier;
import net.minecraft.world.phys.BlockHitResult;

public class DisplayPlace {
	private static BlockHitResult rez;
	private static boolean check;

	public DisplayPlace(BlockHitResult target, boolean handy) {
		this.rez = target;
		this.check = handy;
	}

	public static DisplayPlace reader(FriendlyByteBuf buffer) {
		return new DisplayPlace(buffer.readBlockHitResult(), buffer.readBoolean());
	}

	public static void buffer(DisplayPlace message, FriendlyByteBuf buffer) {
		buffer.writeBlockHitResult(rez);
		buffer.writeBoolean(check);
	}

	public static void handler(DisplayPlace message, Supplier<NetworkEvent.Context> context) {
		context.get().enqueueWork(() -> {
			Player player = context.get().getSender();
			DisplayManager.placeItem(player, player.level(), rez, check);
		});
		context.get().setPacketHandled(true);
	}
}