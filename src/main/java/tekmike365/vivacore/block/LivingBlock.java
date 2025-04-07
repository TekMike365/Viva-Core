package tekmike365.vivacore.block;

import com.mojang.serialization.MapCodec;

import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import tekmike365.vivacore.block.entity.LivingBlockEntity;

public class LivingBlock extends BlockWithEntity {

    public static final MapCodec<LivingBlock> CODEC = LivingBlock.createCodec(LivingBlock::new);

    protected LivingBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new LivingBlockEntity(pos, state);
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

}
