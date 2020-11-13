package obiwanwheeler.testmod.items;

import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.fml.RegistryObject;
import obiwanwheeler.testmod.TestMod;
import obiwanwheeler.testmod.util.RegistryHandler;

public class ModItems {
    public static final RegistryObject<Item> MATSURI = RegistryHandler.ITEMS.register("matsuri", () -> new Item(new Item.Properties().maxStackSize(64).
                                                       group(TestMod.TAB).rarity(Rarity.EPIC)));
}
