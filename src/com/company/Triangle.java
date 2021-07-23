package com.company;

import java.util.Scanner;
class Triangle {
    double height;
    double base;
    double side1;
    double side2;
    double side3;
    double area;
    double perimeter;
    void askInputs()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base: ");
        base=sc.nextDouble();
        System.out.print("Enter height: ");
        height=sc.nextDouble();
        System.out.print("Enter first side: ");
        side1=sc.nextDouble();
        System.out.print("Enter second side: ");
        side2=sc.nextDouble();
        System.out.print("Enter third side: ");
        side3=sc.nextDouble();
    }
    void printAreaPerimeterVolume()
    {
        System.out.println("Area of the Triangle with base= "+base+" and height= "+
                height+" "+"is :"+calcArea());
        System.out.println("Perimeter of the Triangle with side1= "+
                side1+" , side2= "+
                side2+" , side3= "+
                side3+" "+"is :"+
                calcPerimeter()
        );
    }
    double calcArea()
    {
        area= (base*height)/2;
        return area;
    }
    double calcPerimeter()
    {
        perimeter=side1+side2+side3;
        return perimeter;
    }
}
