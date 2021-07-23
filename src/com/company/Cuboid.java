package com.company;

import java.util.Scanner;
class Cuboid {
    double length;
    double breadth;
    double height;
    double area;
    double perimeter;
    void askInputs()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length: ");
        length=sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth=sc.nextDouble();
        System.out.print("Enter height: ");
        height=sc.nextDouble();

    }
    void printAreaPerimeterVolume()
    {
        System.out.println("SurfaceArea of the Rectangle with length= "+length+", breadth= "+
                breadth+"and height "+height+" "+"is :"+calcSurfaceArea());
        System.out.println("Volume of the Rectangle with length= "+length+", breadth= "+
                breadth+"and height "+height+" "+"is :"+calcVolume());
    }
    double calcSurfaceArea()
    {
        area= length*breadth*height;
        return area;
    }
    double calcVolume()
    {
        perimeter=2*(length*breadth+ breadth*height+length*height);
        return perimeter;
    }
}
