package net.mcreator.modabusif.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityTravelToDimensionEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.client.Minecraft;

import net.mcreator.modabusif.network.ModsupertoolModVariables;
import net.mcreator.modabusif.init.ModsupertoolModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DebugFlyProcedure {
	@SubscribeEvent
	public static void onEntityTravelToDimension(EntityTravelToDimensionEvent event) {
		execute(event, event.getDimension(), event.getEntity());
	}

	public static void execute(ResourceKey<Level> dimension, Entity entity) {
		execute(null, dimension, entity);
	}

	private static void execute(@Nullable Event event, ResourceKey<Level> dimension, Entity entity) {
		if (dimension == null || entity == null)
			return;
		if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
				} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
				}
				return false;
			}
		}.checkGamemode(entity) || new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.ADVENTURE;
				} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.ADVENTURE;
				}
				return false;
			}
		}.checkGamemode(entity)) {
			if (dimension == Level.OVERWORLD && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ModsupertoolModItems.BUILDER_HELMET.get())) : false)) {
				if (entity instanceof Player _player) {
					_player.getAbilities().mayfly = true;
					_player.onUpdateAbilities();
				}
			} else if (dimension == Level.NETHER && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ModsupertoolModItems.MAITRE_DU_NETHER_HELMET.get())) : false)) {
				if (entity instanceof Player _player) {
					_player.getAbilities().mayfly = ((entity.getCapability(ModsupertoolModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ModsupertoolModVariables.PlayerVariables())).magie >= 10);
					_player.onUpdateAbilities();
				}
			} else if (dimension == Level.END && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ModsupertoolModItems.ENDER_HELMET.get())) : false)) {
				if (entity instanceof Player _player) {
					_player.getAbilities().mayfly = ((entity.getCapability(ModsupertoolModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ModsupertoolModVariables.PlayerVariables())).magie >= 15);
					_player.onUpdateAbilities();
				}
			} else if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(ModsupertoolModItems.DIVIN_CHESTPLATE.get())) : false) {
				if (entity instanceof Player _player) {
					_player.getAbilities().mayfly = true;
					_player.onUpdateAbilities();
				}
			} else {
				if (entity instanceof Player _player) {
					_player.getAbilities().mayfly = false;
					_player.onUpdateAbilities();
				}
			}
		} else {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = true;
				_player.onUpdateAbilities();
			}
		}
	}
}
