package net.mcreator.modabusif.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class RoiDesMersLeggingsTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWater()) {
			if (entity instanceof Player _player)
				_player.getFoodData().setFoodLevel(19);
		}
	}
}
