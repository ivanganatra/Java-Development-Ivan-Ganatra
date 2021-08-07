package com.company;
import java.util.Scanner;

class Sphere implements Shape {
    double radius;
    double surfaceArea;
    double volume;
    public boolean askInputs(){

        System.out.print("Enter radius: ");
        Scanner sc=new Scanner(System.in);
        radius=sc.nextDouble();

        //return false if there is a error in the input
        if(radius==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public double calcSurfaceArea(){

        surfaceArea= 4*Main_Class.pi*radius*radius;
        return surfaceArea;
    }
    public double calcVolume(){

        volume=((double)4/3)*Main_Class.pi*radius*radius*radius;
        return volume;
    }
}
