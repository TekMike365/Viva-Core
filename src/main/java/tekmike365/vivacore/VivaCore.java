package tekmike365.vivacore;

import net.fabricmc.api.ModInitializer;
import tekmike365.vivacore.block.ModBlocks;
import tekmike365.vivacore.block.entity.ModBlockEntities;
import tekmike365.vivacore.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VivaCore implements ModInitializer {
	public static final String MOD_ID = "viva-core";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.initialise();
		ModBlocks.initialise();
		ModBlockEntities.initialise();
	}

}