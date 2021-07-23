package com.company;

import java.util.Scanner;
class Sphere {
    double radius;
    double surfaceArea;
    double volume;
    void askInputs()
    {
        System.out.print("Enter radius: ");
        Scanner sc=new Scanner(System.in);
        radius=sc.nextDouble();

    }
    void printAreaPerimeterVolume()
    {
        System.out.println("SurfaceArea of the Sphere with radius "+radius+" is :"+calcSurfaceArea());
        System.out.println("Volume of the Sphere with radius "+radius+" is :"+calcVolume());
    }
    double calcSurfaceArea()
    {
        surfaceArea= 4*Main_Class.pi*radius*radius;
        return surfaceArea;
    }
    double calcVolume()
    {
        volume=((double)4/3)*Main_Class.pi*radius*radius*radius;
        return volume;
    }
}
