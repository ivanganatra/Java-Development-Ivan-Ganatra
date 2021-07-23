package com.company;

import java.util.Scanner;
class Cylinder {

    double height;
    double radius;
    double surfaceArea;
    double volume;

    void askInputs() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        radius = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    void printAreaPerimeterVolume() {
        System.out.println("SurfaceArea of the Triangle with radius= " + radius + " and height= " +
                height + " " + "is :" + calcSurfaceArea());
        System.out.println("Volume of the Triangle with raidus= " + radius + " and height= " +
                height + " " + "is :" + calcVolume());
    }

    double calcSurfaceArea() {
        surfaceArea = 2 * Main_Class.pi * radius * height;
        return surfaceArea;
    }

    double calcVolume() {
        volume = Main_Class.pi * radius * radius * height;
        return volume;
    }
}
