package obiwanwheeler.testmod.items;

import net.minecraft.item.Item;
import obiwanwheeler.testmod.TestMod;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(TestMod.TAB));
    }
}
