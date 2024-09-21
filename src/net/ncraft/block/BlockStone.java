
package net.ncraft.block;

import java.util.Random;
import net.ncraft.block.material.Material;

public class BlockStone extends Block {

    public BlockStone(final int blockid, final int blockIndexInTexture) {
        super(blockid, blockIndexInTexture, Material.rock);
    }

    @Override
    public int idDropped(final int blockid, final Random random) {
        return Block.cobblestone.blockID;
    }
}
