package com.DZ1and2;

public abstract class Figures {
    public Figures() {

    }

    public abstract double getSurfaceArea();
    public abstract double getVolume();

    public String name;

    public String getName() {
        return name;
    }

    public Figures(String name) {
        this.name = name;
    }
}
