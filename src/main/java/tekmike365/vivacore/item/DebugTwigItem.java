package tekmike365.vivacore.item;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import tekmike365.vivacore.block.ModBlocks;

public class DebugTwigItem extends Item {

    public DebugTwigItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canMine(ItemStack stack, BlockState state, World world, BlockPos pos, LivingEntity user) {
        return false;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();

        if (world.isClient()) {
            return ActionResult.FAIL;
        }

        world.setBlockState(context.getBlockPos(), ModBlocks.LIVING_BLOCK.getDefaultState());

        return ActionResult.SUCCESS;
    }

}
