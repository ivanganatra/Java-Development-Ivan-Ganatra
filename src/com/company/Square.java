package com.company;

import java.util.Scanner;
class Square {
    double side;
    double area;
    double perimeter;
    void askInputs()
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter side: ");
        side=sc.nextDouble();

    }
    void printAreaPerimeterVolume()
    {
        System.out.println("Area of the Square with side= "+ side+"is :"+ calcArea());
        System.out.println("Perimeter of the Square with side= "+ side+"is :"+ calcPerimeter());
    }
    double calcArea()
    {
        area= side*side;
        return area;
    }
    double calcPerimeter()
    {
        perimeter=4*side;
        return perimeter;
    }
}
