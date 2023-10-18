package net.matt.pastrymod.item;

import net.matt.pastrymod.PastryMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PastryMod.MODID);

    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PASTRYMOD_TAB)));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
