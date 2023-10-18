package net.matt.pastrymod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab PASTRYMOD_TAB = new CreativeModeTab("pastrymodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FLOUR.get());
        }
    };
}
