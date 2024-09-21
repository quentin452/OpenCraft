
package net.opencraft.block;

import java.util.Random;
import net.opencraft.block.material.Material;

public class BlockLog extends Block {

    protected BlockLog(final int blockid) {
        super(blockid, Material.wood);
        this.blockIndexInTexture = 20;
    }

    @Override
    public int quantityDropped(final Random random) {
        return 1;
    }

    @Override
    public int idDropped(final int blockid, final Random random) {
        return Block.wood.blockID;
    }

    @Override
    public int getBlockTextureFromSide(final int textureIndexSlot) {
        if (textureIndexSlot == 1) {
            return 21;
        }
        if (textureIndexSlot == 0) {
            return 21;
        }
        return 20;
    }
}