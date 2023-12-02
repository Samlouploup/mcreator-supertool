package net.mcreator.modabusif.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;

public class RoiDesMersBodyTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWater()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.DAMAGE_BOOST) : false) == false) {
				entity.hurt(DamageSource.DROWN, 1);
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 999, 0, false, false));
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.SCUTE);
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 60, 0, false, false));
		}
	}
}
