
package net.ncraft;

import net.ncraft.util.Vec3D;

public class PositionTextureVertex {

    public Vec3D vector3D;
    public float texturePositionX;
    public float texturePositionY;

    public PositionTextureVertex(final float float1, final float float2, final float float3, final float float4, final float float5) {
        this(Vec3D.createVectorHelper(float1, float2, float3), float4, float5);
    }


    public PositionTextureVertex(final PositionTextureVertex hi, final float float2, final float float3) {
        this.vector3D = hi.vector3D;
        this.texturePositionX = float2;
        this.texturePositionY = float3;
    }

    public PositionTextureVertex(final Vec3D bo, final float float2, final float float3) {
        this.vector3D = bo;
        this.texturePositionX = float2;
        this.texturePositionY = float3;
    }

    public PositionTextureVertex setTexturePosition(final float float1, final float float2) {
        return new PositionTextureVertex(this, float1, float2);
    }
}
