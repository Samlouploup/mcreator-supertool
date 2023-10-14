
package net.mcreator.modabusif.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.modabusif.world.inventory.EntreItemsMenu;
import net.mcreator.modabusif.procedures.OuvrirAutresProcedure;
import net.mcreator.modabusif.procedures.OeilDuWitherFouGuiOuvertureProcedure;
import net.mcreator.modabusif.procedures.LeCodexEvenementAuClicDroitDansLairProcedure;
import net.mcreator.modabusif.procedures.FlammeMagiqueguiouvertureProcedure;
import net.mcreator.modabusif.procedures.AmeMondeGuiOuvertureProcedure;
import net.mcreator.modabusif.ModsupertoolMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntreItemsButtonMessage {
	private final int buttonID, x, y, z;

	public EntreItemsButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public EntreItemsButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(EntreItemsButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(EntreItemsButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = EntreItemsMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			FlammeMagiqueguiouvertureProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			AmeMondeGuiOuvertureProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			LeCodexEvenementAuClicDroitDansLairProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			OuvrirAutresProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			OeilDuWitherFouGuiOuvertureProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ModsupertoolMod.addNetworkMessage(EntreItemsButtonMessage.class, EntreItemsButtonMessage::buffer, EntreItemsButtonMessage::new, EntreItemsButtonMessage::handler);
	}
}
