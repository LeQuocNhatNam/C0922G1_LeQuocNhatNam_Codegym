package exercise.point_2D_3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    public float[] getXYZ() {
        float [] arr = new float[3];
        arr[0] = super.getX();
        arr[1] = super.getY();
        arr[2] = this.getZ();
        return arr;
    }

    @Override
    public String toString(){
        return Arrays.toString(this.getXYZ());
    }
}
