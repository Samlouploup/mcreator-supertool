
package net.mcreator.modabusif.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.modabusif.world.inventory.BouteilleMenu;
import net.mcreator.modabusif.procedures.Terre2048Procedure;
import net.mcreator.modabusif.procedures.Terre1024Procedure;
import net.mcreator.modabusif.procedures.PlastronProcedure;
import net.mcreator.modabusif.procedures.JambeProcedure;
import net.mcreator.modabusif.procedures.CasqueProcedure;
import net.mcreator.modabusif.procedures.BottesProcedure;
import net.mcreator.modabusif.ModsupertoolMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BouteilleButtonMessage {
	private final int buttonID, x, y, z;

	public BouteilleButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BouteilleButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BouteilleButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BouteilleButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = BouteilleMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			BottesProcedure.execute(entity);
		}
		if (buttonID == 1) {

			JambeProcedure.execute(entity);
		}
		if (buttonID == 2) {

			PlastronProcedure.execute(entity);
		}
		if (buttonID == 3) {

			CasqueProcedure.execute(entity);
		}
		if (buttonID == 4) {

			Terre1024Procedure.execute(entity);
		}
		if (buttonID == 5) {

			Terre2048Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ModsupertoolMod.addNetworkMessage(BouteilleButtonMessage.class, BouteilleButtonMessage::buffer, BouteilleButtonMessage::new, BouteilleButtonMessage::handler);
	}
}
