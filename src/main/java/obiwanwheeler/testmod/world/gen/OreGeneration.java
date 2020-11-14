package obiwanwheeler.testmod.world.gen;

import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import obiwanwheeler.testmod.TestMod;
import obiwanwheeler.testmod.blocks.ModBlocks;

import java.util.ArrayList;
import java.util.Objects;

@Mod.EventBusSubscriber()
public class OreGeneration {

    private static final ArrayList<ConfiguredFeature<?,?>> ORES = new ArrayList<>();

    public static void setupOreGeneration(){
        addOre(ModBlocks.MATSURIBLOCK_BLOCK.get(), 8, 128, 1000);
        addOre(ModBlocks.POOBLOCK_BLOCK.get(), 20, 128, 1000);
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void onBiomeLoad(BiomeLoadingEvent event){
        switch (event.getCategory()){
            case NETHER:
            case THEEND:
                break;
            default:
                for(ConfiguredFeature<?, ?> ore : ORES){
                    event.getGeneration().withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
                }
                break;
        }
    }

    private static void addOre(Block block, int veinSize, int yLimit, int count) {
        ORES.add(register("ore_" + Objects.requireNonNull(block.getRegistryName()).getPath(), Feature.ORE.withConfiguration(
                new OreFeatureConfig(OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, block.getDefaultState(), veinSize))
                .range(yLimit).square().func_242731_b(count)));
    }

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, TestMod.MODID + ":" + name, configuredFeature);
    }
}

