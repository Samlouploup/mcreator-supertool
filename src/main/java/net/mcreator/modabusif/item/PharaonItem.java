
package net.mcreator.modabusif.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
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

import net.mcreator.modabusif.procedures.PharaonlegginstickeventProcedure;
import net.mcreator.modabusif.procedures.PharaonbootstickeventProcedure;
import net.mcreator.modabusif.procedures.PharaonbodytickeventProcedure;
import net.mcreator.modabusif.procedures.PharaonHelmetTickEventProcedure;
import net.mcreator.modabusif.init.ModsupertoolModTabs;

import java.util.List;

public abstract class PharaonItem extends ArmorItem {
	public PharaonItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 0;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{10, 10, 10, 10}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 20;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.LAPIS_BLOCK), new ItemStack(Blocks.GOLD_BLOCK));
			}

			@Override
			public String getName() {
				return "pharaon";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.4f;
			}
		}, slot, properties);
	}

	public static class Helmet extends PharaonItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("enchant\u00E9e"));
			list.add(Component.literal("donne vision nocturne"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "modsupertool:textures/models/armor/pharaon_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			PharaonHelmetTickEventProcedure.execute(entity);
		}
	}

	public static class Chestplate extends PharaonItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("enchant\u00E9"));
			list.add(Component.literal("donne force 2"));
			list.add(Component.literal("suprime les mauvais pr\u00E9sages"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "modsupertool:textures/models/armor/pharaon_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			PharaonbodytickeventProcedure.execute(entity);
		}
	}

	public static class Leggings extends PharaonItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("enchant\u00E9"));
			list.add(Component.literal("suprime la malchance"));
			list.add(Component.literal("donne h\u00E9ro du village 2"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "modsupertool:textures/models/armor/pharaon_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			PharaonlegginstickeventProcedure.execute(entity);
		}
	}

	public static class Boots extends PharaonItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, world, list, flag);
			list.add(Component.literal("enchant\u00E9"));
			list.add(Component.literal("donne c\u00E9l\u00E9rit\u00E9 2"));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "modsupertool:textures/models/armor/pharaon_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			PharaonbootstickeventProcedure.execute(entity);
		}
	}
}
