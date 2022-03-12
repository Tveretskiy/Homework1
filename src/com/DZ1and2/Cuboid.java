package com.DZ1and2;

public class Cuboid extends Figures{

    public double width;
    public double heigth;
    public double length;

    public Cuboid(String name, double width, double heigth, double length) {

        this.width = width;
        this.heigth = heigth;
        this.length = length;

    }
//    public void getRadius() {
//        return radius;
//    }



    @Override
    public double getSurfaceArea() {
        return 2 * (length * heigth + length * width + width * heigth);
    }

    @Override
    public double getVolume() {
        return length * width * heigth;
    }
}
