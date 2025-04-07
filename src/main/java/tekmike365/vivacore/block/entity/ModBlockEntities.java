package tekmike365.vivacore.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import tekmike365.vivacore.VivaCore;
import tekmike365.vivacore.block.ModBlocks;

public class ModBlockEntities {

    public static final BlockEntityType<LivingBlockEntity> LIVING_BLOCK_BE = Registry.register(
            Registries.BLOCK_ENTITY_TYPE, Identifier.of(VivaCore.MOD_ID, "living_block_be"),
            FabricBlockEntityTypeBuilder.create(LivingBlockEntity::new, ModBlocks.LIVING_BLOCK).build());

    public static void initialise() {
        VivaCore.LOGGER.info("Registering block entities for: " + VivaCore.MOD_ID);
    }

}
