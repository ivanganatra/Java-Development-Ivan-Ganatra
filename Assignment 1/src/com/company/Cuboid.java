package com.company;

import java.util.Scanner;
class Cuboid implements Shape{
    double length;
    double breadth;
    double height;
    double surfaceArea;
    double volume;
    public boolean askInputs() {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length: ");
        length=sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth=sc.nextDouble();
        System.out.print("Enter height: ");
        height=sc.nextDouble();

        //return false if there is a error in the input
        if(length==0 || breadth==0 || height==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public double calcSurfaceArea() {

        surfaceArea=2*(length*breadth+ breadth*height+length*height);
        return surfaceArea;
    }
    public double calcVolume() {

        volume= length*breadth*height;
        return volume;
    }
}
