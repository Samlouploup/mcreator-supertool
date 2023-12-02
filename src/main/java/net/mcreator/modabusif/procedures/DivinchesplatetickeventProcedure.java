package net.mcreator.modabusif.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.modabusif.init.ModsupertoolModItems;

import java.util.Map;

public class DivinchesplatetickeventProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 3, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 2, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 2, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 1, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 60, 1, false, false));
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.UNLUCK);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.BAD_OMEN);
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
			if (_enchantments.containsKey(Enchantments.ALL_DAMAGE_PROTECTION)) {
				_enchantments.remove(Enchantments.ALL_DAMAGE_PROTECTION);
				EnchantmentHelper.setEnchantments(_enchantments, itemstack);
			}
		}
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
			if (_enchantments.containsKey(Enchantments.FIRE_PROTECTION)) {
				_enchantments.remove(Enchantments.FIRE_PROTECTION);
				EnchantmentHelper.setEnchantments(_enchantments, itemstack);
			}
		}
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
			if (_enchantments.containsKey(Enchantments.BLAST_PROTECTION)) {
				_enchantments.remove(Enchantments.BLAST_PROTECTION);
				EnchantmentHelper.setEnchantments(_enchantments, itemstack);
			}
		}
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
			if (_enchantments.containsKey(Enchantments.PROJECTILE_PROTECTION)) {
				_enchantments.remove(Enchantments.PROJECTILE_PROTECTION);
				EnchantmentHelper.setEnchantments(_enchantments, itemstack);
			}
		}
		(itemstack).enchant(Enchantments.BLAST_PROTECTION, 20);
		(itemstack).enchant(Enchantments.ALL_DAMAGE_PROTECTION, 20);
		(itemstack).enchant(Enchantments.FIRE_PROTECTION, 20);
		(itemstack).enchant(Enchantments.PROJECTILE_PROTECTION, 20);
		if (ModsupertoolModItems.DIVIN_BOOTS.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()) {
			if (ModsupertoolModItems.DIVIN_LEGGINGS.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem()) {
				if (ModsupertoolModItems.DIVIN_HELMET.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem()) {
					if (entity instanceof Player _player) {
						_player.getAbilities().invulnerable = true;
						_player.onUpdateAbilities();
					}
					if (entity instanceof Player _player)
						_player.giveExperiencePoints((int) 0.1);
				}
			}
		}
	}
}
