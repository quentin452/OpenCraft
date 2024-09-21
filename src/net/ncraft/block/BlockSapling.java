
package net.ncraft.block;

import java.util.Random;
import net.ncraft.world.World;
import net.ncraft.world.gen.WorldGenTrees;

public class BlockSapling extends BlockFlower {

    protected BlockSapling(final int blockid, final int blockIndexInTexture) {
        super(blockid, blockIndexInTexture);
        final float n = 0.4f;
        this.setBlockBounds(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, n * 2.0f, 0.5f + n);
    }

    @Override
    public void updateTick(final World world, final int xCoord, final int yCoord, final int zCoord, final Random random) {
        super.updateTick(world, xCoord, yCoord, zCoord, random);
        if (world.getBlockLightValue(xCoord, yCoord + 1, zCoord) >= 9 && random.nextInt(5) == 0) {
            final int blockMetadata = world.getBlockMetadata(xCoord, yCoord, zCoord);
            if (blockMetadata < 15) {
                world.setBlockMetadataWithNotify(xCoord, yCoord, zCoord, blockMetadata + 1);
            } else {
                world.setBlock(xCoord, yCoord, zCoord, 0);
                if (!new WorldGenTrees().generate(world, random, xCoord, yCoord, zCoord)) {
                    world.setBlock(xCoord, yCoord, zCoord, this.blockID);
                }
            }
        }
    }
}
