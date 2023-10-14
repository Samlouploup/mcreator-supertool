
package net.mcreator.modabusif.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.modabusif.procedures.RoiDesMersLeggingsTickEventProcedure;
import net.mcreator.modabusif.procedures.RoiDesMersHelmetTickEventProcedure;
import net.mcreator.modabusif.procedures.RoiDesMersEvenementDeTickDesBottesProcedure;
import net.mcreator.modabusif.procedures.RoiDesMersBodyTickEventProcedure;
import net.mcreator.modabusif.init.ModsupertoolModTabs;

import java.util.List;

public abstract class RoiDesMersItem extends ArmorItem {
	public RoiDesMersItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 0;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{4, 4, 4, 4}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.HEART_OF_THE_SEA));
			}

			@Override
			public String getName() {
				return "roi_des_mers";
			}

			@Override
			public float getToughness() {
				return 0.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends RoiDesMersItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("donne pouvoir du conduit sous l'eau"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "modsupertool:textures/models/armor/roi_des_mer_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			RoiDesMersHelmetTickEventProcedure.execute(entity, itemstack);
		}
	}

	public static class Chestplate extends RoiDesMersItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("permet une mue sous l'eau pour gagner des \u00E9cailles"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "modsupertool:textures/models/armor/roi_des_mer_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			RoiDesMersBodyTickEventProcedure.execute(entity);
		}
	}

	public static class Leggings extends RoiDesMersItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("suprime la faim sous l'eau"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "modsupertool:textures/models/armor/roi_des_mer_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			RoiDesMersLeggingsTickEventProcedure.execute(entity);
		}
	}

	public static class Boots extends RoiDesMersItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("permet d'aller vite sous l'eau"));
			list.add(Component.literal("peut \u00EAtre am\u00E9lior\u00E9 en version coureur des mers"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "modsupertool:textures/models/armor/roi_des_mer_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			RoiDesMersEvenementDeTickDesBottesProcedure.execute(itemstack);
		}
	}
}
