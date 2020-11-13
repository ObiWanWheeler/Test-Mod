package obiwanwheeler.testmod.items;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import obiwanwheeler.testmod.TestMod;
import obiwanwheeler.testmod.blocks.ModBlocks;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);

    public static final RegistryObject<Item> MATSURI = ITEMS.register("matsuri", () -> new Item(new Item.Properties().maxStackSize(64).
                                                       group(TestMod.TAB).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> MATSURIBLOCK_BLOCK_ITEM = ITEMS.register("matsuri_block",
            () -> new BlockItem(ModBlocks.MATSURIBLOCK_BLOCK.get(), new Item.Properties().maxStackSize(64).group(TestMod.TAB)));
}
