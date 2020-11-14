package obiwanwheeler.testmod.items;

import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import obiwanwheeler.testmod.TestMod;
import obiwanwheeler.testmod.blocks.ModBlocks;
import obiwanwheeler.testmod.tools.ModItemTier;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> MATSURI = ITEMS.register("matsuri", () -> new Item(new Item.Properties().maxStackSize(64).
                                                       group(TestMod.TAB).rarity(Rarity.EPIC)));
    public static final RegistryObject<Item> MATSURIBLOCK_BLOCK_ITEM = ITEMS.register("matsuri_block",
            () -> new BlockItem(ModBlocks.MATSURIBLOCK_BLOCK.get(), new Item.Properties().maxStackSize(64).group(TestMod.TAB)));
    public static final RegistryObject<SwordItem> MATUSRI_SWORD = ITEMS.register("matsuri_sword",
            () -> new SwordItem(ModItemTier.MATSURI, 8, 0.0f,
                    new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire().rarity(Rarity.EPIC)));
    public static final RegistryObject<PickaxeItem> MATSURI_PICKAXE = ITEMS.register("matsuri_pickaxe",
            () -> new PickaxeItem(ModItemTier.MATSURI, 4, 0.0f,
                    new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<ShovelItem> MATSURI_SHOVEL = ITEMS.register("matsuri_shovel",
            () -> new ShovelItem(ModItemTier.MATSURI, 4, 0.0f,
                    new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<AxeItem> MATSURI_AXE = ITEMS.register("matsuri_axe",
            () -> new AxeItem(ModItemTier.MATSURI, 6, 0.0f,
                    new Item.Properties().group(ItemGroup.TOOLS)));
    public static final RegistryObject<HoeItem> MATSURI_HOE = ITEMS.register("matsuri_hoe",
            () -> new HoeItem(ModItemTier.MATSURI, 10, 0.0f,
                    new Item.Properties().group(ItemGroup.TOOLS)));
}
