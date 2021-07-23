package com.company;

import java.util.Scanner;
class Cylinder implements Shape{

    double height;
    double radius;
    double surfaceArea;
    double volume;

    public boolean askInputs() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        radius = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();

        //return false if there is a error in the input
        if(radius==0 || height==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public double calcSurfaceArea() {

        surfaceArea = 2 * Main_Class.pi * radius * height +2*Main_Class.pi*radius;
        return surfaceArea;
    }

    public double calcVolume() {

        volume = Main_Class.pi * radius * radius * height;
        return volume;
    }
}
