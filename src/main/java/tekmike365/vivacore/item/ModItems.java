package tekmike365.vivacore.item;

import java.util.function.Function;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import tekmike365.vivacore.VivaCore;

public class ModItems {

    public static final Item DEBUG_TWIG = register("debug_twig", DebugTwigItem::new, new Item.Settings());

    public static void initialise() {
        VivaCore.LOGGER.info("Registering mod items for: " + VivaCore.MOD_ID);
    }

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VivaCore.MOD_ID, name));
        Item item = itemFactory.apply(settings.registryKey(itemKey));
        Registry.register(Registries.ITEM, itemKey, item);
        return item;
    }

}
