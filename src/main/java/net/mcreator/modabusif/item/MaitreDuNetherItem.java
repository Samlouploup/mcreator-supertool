
package net.mcreator.modabusif.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.modabusif.procedures.MaitreDuNetherEvenementDeTickDuPlastronProcedure;
import net.mcreator.modabusif.procedures.MaitreDuNetherEvenementDeTickDuCasqueProcedure;
import net.mcreator.modabusif.procedures.MaitreDuNetherEvenementDeTickDesJambieresProcedure;
import net.mcreator.modabusif.procedures.MaitreDuNetherEvenementDeTickDesBottesProcedure;

import net.mcreator.modabusif.init.ModsupertoolModTabs;

public abstract class MaitreDuNetherItem extends ArmorItem {
	public MaitreDuNetherItem(EquipmentSlot slot, Item.Properties properties) {
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
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "maitre_du_nether";
			}

			@Override
			public float getToughness() {
				return 0.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends MaitreDuNetherItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "modsupertool:textures/models/armor/maitredunether_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			MaitreDuNetherEvenementDeTickDuCasqueProcedure.execute(entity);
		}
		@Override
        public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer)
        {
            return true;
        }
	}

	public static class Chestplate extends MaitreDuNetherItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "modsupertool:textures/models/armor/maitredunether_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			MaitreDuNetherEvenementDeTickDuPlastronProcedure.execute(entity);
		}
		@Override
        public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer)
        {
            return true;
        }
	}

	public static class Leggings extends MaitreDuNetherItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "modsupertool:textures/models/armor/maitredunether_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			MaitreDuNetherEvenementDeTickDesJambieresProcedure.execute(entity);
		}
		@Override
        public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer)
        {
            return true;
        }
	}

	public static class Boots extends MaitreDuNetherItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ModsupertoolModTabs.TAB_ARMURES_OUTILS_SUPER_TOOLS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "modsupertool:textures/models/armor/maitredunether_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			MaitreDuNetherEvenementDeTickDesBottesProcedure.execute(entity, itemstack);
		}
		@Override
        public boolean makesPiglinsNeutral(ItemStack stack, LivingEntity wearer)
        {
            return true;
        }
	}
}
