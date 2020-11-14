package obiwanwheeler.testmod.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import obiwanwheeler.testmod.items.ModItems;

import java.rmi.registry.RegistryHandler;
import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    MATSURI(3, 5000, 10f, 3.0f, 25, () -> { return Ingredient.fromItems(ModItems.MATUSRI_SWORD.get());});

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantibility;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantibility, Supplier<Ingredient> repairMaterial){
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantibility = enchantibility;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantibility;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
