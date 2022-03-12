package com.DZ1and2;

public class Sphere extends Figures{

    public double radius;

    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;

    }
//    public void getRadius() {
//        return radius;
//    }



    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }
}
