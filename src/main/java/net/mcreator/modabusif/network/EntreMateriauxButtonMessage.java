
package net.mcreator.modabusif.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.modabusif.world.inventory.EntreMateriauxMenu;
import net.mcreator.modabusif.procedures.SupremeGuiOuvertureProcedure;
import net.mcreator.modabusif.procedures.PharaonGuiOuvertureProcedure;
import net.mcreator.modabusif.procedures.ParfaitGuiOuvertureProcedure;
import net.mcreator.modabusif.procedures.NaturelGuiOuvertureProcedure;
import net.mcreator.modabusif.procedures.LeCodexEvenementAuClicDroitDansLairProcedure;
import net.mcreator.modabusif.procedures.EarthenergieGuiOuvertureProcedure;
import net.mcreator.modabusif.procedures.ConducteurGuiOuvertureProcedure;
import net.mcreator.modabusif.ModsupertoolMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntreMateriauxButtonMessage {
	private final int buttonID, x, y, z;

	public EntreMateriauxButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public EntreMateriauxButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(EntreMateriauxButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(EntreMateriauxButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = EntreMateriauxMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			EarthenergieGuiOuvertureProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			PharaonGuiOuvertureProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			SupremeGuiOuvertureProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			ParfaitGuiOuvertureProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			NaturelGuiOuvertureProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			ConducteurGuiOuvertureProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 6) {

			LeCodexEvenementAuClicDroitDansLairProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		ModsupertoolMod.addNetworkMessage(EntreMateriauxButtonMessage.class, EntreMateriauxButtonMessage::buffer, EntreMateriauxButtonMessage::new, EntreMateriauxButtonMessage::handler);
	}
}
