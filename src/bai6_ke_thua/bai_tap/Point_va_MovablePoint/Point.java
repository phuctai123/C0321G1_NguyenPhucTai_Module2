package bai6_ke_thua.bai_tap.Point_va_MovablePoint;

import java.util.Arrays;

public class Point {
    private float x;
    private float y;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] array = new float[2];
        array[0] = this.x;
        array[1] = this.y;
        return array;
    }

    @Override
    public String toString() {
        return "(x,y) = " +
                Arrays.toString(this.getXY());

    }
}
