package com.company;

import java.util.Scanner;

class Cube implements Shape{

    double side;
    double surfaceArea;
    double volume;

    public boolean askInputs() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        side = sc.nextDouble();

        //return false if there is a error in the input
        if(side==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public double calcSurfaceArea() {

        surfaceArea = 6*side*side;
        return surfaceArea;
    }

    public double calcVolume() {

        volume = side*side*side;
        return volume;
    }
}
