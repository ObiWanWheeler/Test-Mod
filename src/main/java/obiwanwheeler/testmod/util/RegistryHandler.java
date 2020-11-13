package obiwanwheeler.testmod.util;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import obiwanwheeler.testmod.TestMod;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import obiwanwheeler.testmod.blocks.TestBlock;
import obiwanwheeler.testmod.items.ItemBase;


public class RegistryHandler {

    //this is like a list of items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> MATSURI = ITEMS.register("matsuri", ItemBase::new);

    //Blocks
    public static final RegistryObject<Block> TESTBLOCK_BLOCK = BLOCKS.register("test_block", TestBlock::new);

    //Block Items
    public static final
}
