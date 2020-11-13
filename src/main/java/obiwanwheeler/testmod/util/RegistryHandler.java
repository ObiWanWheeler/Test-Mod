package obiwanwheeler.testmod.util;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Rarity;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import obiwanwheeler.testmod.TestMod;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import obiwanwheeler.testmod.blocks.ModBlocks;


public class RegistryHandler {

    //this is like a list of items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> MATSURI = ITEMS.register("matsuri", () -> new Item(new Item.Properties().maxStackSize(64).
            group(TestMod.TAB).rarity(Rarity.EPIC)));
    //Blocks
    public static final RegistryObject<Block> TESTBLOCK_BLOCK = RegistryHandler.BLOCKS.register("test_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLUE).
            setRequiresTool().hardnessAndResistance(1.5f,6.0f).sound(SoundType.STONE)
            .harvestLevel(3).harvestTool(ToolType.PICKAXE)));
    //Block Items
    public static final RegistryObject<Item> TESTBLOCK_BLOCK_ITEM = RegistryHandler.ITEMS.register("test_block",
            () -> new BlockItem(TESTBLOCK_BLOCK.get(), new Item.Properties().maxStackSize(64).group(TestMod.TAB)));

}
