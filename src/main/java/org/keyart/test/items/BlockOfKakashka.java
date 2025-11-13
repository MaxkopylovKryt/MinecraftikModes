package org.keyart.test.items;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BlockOfKakashka extends Block {

    public BlockOfKakashka() {
        super(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK));
    }

}
