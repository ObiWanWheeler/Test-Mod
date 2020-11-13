package obiwanwheeler.testmod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import obiwanwheeler.testmod.util.RegistryHandler;

public class ModBlocks {
    public static final RegistryObject<Block> MATSURIBLOCK_BLOCK = RegistryHandler.BLOCKS.register("matsuri_block", () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLUE).
            setRequiresTool().hardnessAndResistance(1.5f,6.0f).sound(SoundType.STONE)
            .harvestLevel(3).harvestTool(ToolType.PICKAXE)));
}
