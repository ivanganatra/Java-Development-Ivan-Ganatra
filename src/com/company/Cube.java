package com.company;

import java.util.Scanner;
class Cube {

    double side;
    double surfaceArea;
    double volume;

    void askInputs() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        side = sc.nextDouble();
    }

    void printAreaPerimeterVolume() {
        System.out.println("SurfaceArea of Cuboid with side= "+ side+"is :"+ calcSurfaceArea());
        System.out.println("Volume of Cuboid with side= "+ side+"is :"+ calcVolume());
    }

    double calcSurfaceArea() {
        surfaceArea = 6*side*side;
        return surfaceArea;
    }

    double calcVolume() {
        volume = side*side*side;
        return volume;
    }
}
