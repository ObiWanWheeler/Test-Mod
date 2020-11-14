package obiwanwheeler.testmod.armor;

import net.minecraft.client.audio.Sound;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import obiwanwheeler.testmod.TestMod;
import obiwanwheeler.testmod.items.ModItems;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {

    MATSURI("minecraft:diamond", 50, new int[]{ 9, 10, 12, 8 }, 50,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 3f, () -> { return Ingredient.fromItems(ModItems.MATSURI.get());}, 2f);

    private static final int[] DURABILITY_ARRAY = new int[]{ 11, 16, 15, 13 };
    private final String name;
    private final int durabilityFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantibility;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockBackResistance;

    ModArmorMaterial(String name, int durabilityFactor, int[] damageReductionAmountArray, int enchantibility,
                     SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial, float knockBackResistance){
        this.name = name;
        this.durabilityFactor = durabilityFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantibility = enchantibility;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
        this.knockBackResistance = knockBackResistance;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return DURABILITY_ARRAY[slotIn.getIndex()] * this.durabilityFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return enchantibility;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return knockBackResistance;
    }
}
