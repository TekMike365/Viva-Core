package tekmike365.vivacore.block;

import java.util.function.Function;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import tekmike365.vivacore.VivaCore;

public class ModBlocks {

    public static final Block LIVING_BLOCK = register("living_block", LivingBlock::new, AbstractBlock.Settings.create(),
            false);

    public static void initialise() {
        VivaCore.LOGGER.info("Registering mod blocks for: " + VivaCore.MOD_ID);
    }

    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory,
            AbstractBlock.Settings settings, boolean shouldRegisterItem) {

        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VivaCore.MOD_ID, name));
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VivaCore.MOD_ID, name));

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

}
