package obiwanwheeler.testmod.blockitems;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import obiwanwheeler.testmod.TestMod;
import obiwanwheeler.testmod.blocks.ModBlocks;
import obiwanwheeler.testmod.util.RegistryHandler;

public class ModBlockItems {
    public static final RegistryObject<Item> MATSURIBLOCK_BLOCK_ITEM = RegistryHandler.ITEMS.register("matsuri_block",
                                                                    () -> new BlockItem(ModBlocks.MATSURIBLOCK_BLOCK.get(), new Item.Properties().maxStackSize(64).group(TestMod.TAB)));
}
