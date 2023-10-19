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
    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PASTRYMOD_TAB)));
    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PASTRYMOD_TAB)));
    public static final RegistryObject<Item> DONUT_RAW = ITEMS.register("donut_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PASTRYMOD_TAB)));
    public static final RegistryObject<Item> DONUT_COOKED = ITEMS.register("donut_cooked",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PASTRYMOD_TAB)));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
