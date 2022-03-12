package com.DZ1and2;

public class Equations {
    public void QuadEquation(double a, double b, double c) {
        double d;

        d = b * b - (4 * a * c);

        if (d < 0) {
            System.out.println("У этого уравнения нет корней");
        } else if (d == 0) {
            double x1 = (-b) / (2 * a);
            System.out.println("У этого уравнения один корень: x = " + x1);
        } else {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("У этого уравнения два корня: x1 = " + x1 + " x2 = " + x2);
        }

    }
}
