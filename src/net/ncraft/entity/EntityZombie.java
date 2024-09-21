
package net.ncraft.entity;

import net.ncraft.item.Item;
import net.ncraft.util.MathHelper;
import net.ncraft.world.World;

public class EntityZombie extends EntityMonster {

    public EntityZombie(final World world) {
        super(world);
        this.texture = "/assets/mob/zombie.png";
        this.moveSpeed = 0.5f;
        this.attackStrength = 5;
    }

    @Override
    public void onLivingUpdate() {
        if (this.worldObj.isDaytime()) {
            final float entityBrightness = this.getEntityBrightness(1.0f);
            if (entityBrightness > 0.5f && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.rand.nextFloat() * 30.0f < (entityBrightness - 0.4f) * 2.0f) {
                this.fire = 300;
            }
        }
        super.onLivingUpdate();
    }

    @Override
    protected int scoreValue() {
        return Item.feather.shiftedIndex;
    }
}
