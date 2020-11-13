package obiwanwheeler.testmod;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import obiwanwheeler.testmod.blocks.ModBlocks;
import obiwanwheeler.testmod.items.ModItems;
import obiwanwheeler.testmod.util.RegistryHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(TestMod.MODID)
public class TestMod{

    public static final String MODID = "testmod";

    private static final Logger LOGGER = LogManager.getLogger();

    public TestMod(){
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this :: setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this :: doClientStuff);

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(eventBus);g
        ModBlocks.BLOCKS.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static final ItemGroup TAB = new ItemGroup("testModTab"){
        @Override
        public ItemStack createIcon(){
            return new ItemStack(ModItems.MATSURI.get());
        }
    };
}
