package obiwanwheeler.testmod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import obiwanwheeler.testmod.TestMod;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);

    public static final RegistryObject<Block> MATSURIBLOCK_BLOCK = BLOCKS.register("matsuri_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLUE).
            setRequiresTool().hardnessAndResistance(1.5f,6.0f).sound(SoundType.STONE)
            .harvestLevel(3).harvestTool(ToolType.PICKAXE)));
}
