package com.company;

import java.util.Scanner;
class Rectangle {
    double length;
    double breadth;
    double surface_area;
    double volume;
    void askInputs()
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length: ");
        length=sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth=sc.nextDouble();

    }
    void printAreaPerimeterVolume()
    {
        System.out.println("Area of the Rectangle with length= "+length+" and breadth= "+
                           breadth+" "+"is :"+calcSurfaceArea());
        System.out.println("Perimeter of the Rectangle with length= "+length+" and breadth= "+
                           breadth+" "+"is :"+calcVolume());
    }
    double calcSurfaceArea()
    {
        surface_area= length*breadth;
        return surface_area;
    }
    double calcVolume()
    {
        volume=2*(length+breadth);
        return volume;
    }
}
