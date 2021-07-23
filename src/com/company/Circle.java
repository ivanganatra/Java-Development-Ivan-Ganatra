package com.company;

import java.util.Scanner;
class Circle {
    double radius;
    double area;
    double perimeter;
    void askInputs()
    {
        System.out.print("Enter radius: ");
        Scanner sc=new Scanner(System.in);
        radius=sc.nextDouble();

    }
    void printAreaPerimeterVolume()
    {
        System.out.println("Area of the Circle with radius "+radius+" is :"+calcArea());
        System.out.println("Perimeter of the Circle with radius "+radius+" is :"+calcPerimeter());
    }
    double calcArea()
    {
        area= Main_Class.pi*radius*radius;
        return area;
    }
    double calcPerimeter()
    {
        perimeter=2*Main_Class.pi*radius;
        return perimeter;
    }
}
