
package net.mcreator.modabusif.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
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

import net.mcreator.modabusif.procedures.DivinchesplatetickeventProcedure;
import net.mcreator.modabusif.procedures.DivinLegginsTickEventProcedure;
import net.mcreator.modabusif.procedures.DivinHelmetTickEventProcedure;
import net.mcreator.modabusif.procedures.DivinBootsTickEventProcedure;
import net.mcreator.modabusif.init.ModsupertoolModTabs;
import net.mcreator.modabusif.init.ModsupertoolModItems;

import java.util.List;

public abstract class DivinItem extends ArmorItem {
	public DivinItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 0;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{30, 30, 30, 30}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 100;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ModsupertoolModItems.SUPER_STAR.get()));
			}

			@Override
			public String getName() {
				return "divin";
			}

			@Override
			public float getToughness() {
				return 10f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends DivinItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("la plus puissante de toute les armures"));
			list.add(Component.literal("full set:immortalit\u00E9e"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "modsupertool:textures/models/armor/divine_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			DivinHelmetTickEventProcedure.execute(entity, itemstack);
		}
	}

	public static class Chestplate extends DivinItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("la plus puissante de toute les armures"));
			list.add(Component.literal("full set:immortalit\u00E9e"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "modsupertool:textures/models/armor/divine_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			DivinchesplatetickeventProcedure.execute(entity, itemstack);
		}
	}

	public static class Leggings extends DivinItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("la plus puissante de toute les armures"));
			list.add(Component.literal("full set:immortalit\u00E9e"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "modsupertool:textures/models/armor/divine_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			DivinLegginsTickEventProcedure.execute(entity, itemstack);
		}
	}

	public static class Boots extends DivinItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS).fireResistant());
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("la plus puissante de toute les armures"));
			list.add(Component.literal("full set:immortalit\u00E9e"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "modsupertool:textures/models/armor/divine_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			DivinBootsTickEventProcedure.execute(entity, itemstack);
		}
	}
}
