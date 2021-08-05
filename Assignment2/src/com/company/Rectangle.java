package com.company;

import java.util.Scanner;

class Rectangle implements Shape {
    double length;
    double breadth;
    double area;
    double perimeter;
    public boolean askInputs() {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length: ");
        length=sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth=sc.nextDouble();

        //return false if there is a error in the input
        if(length==0 || breadth==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public double calcArea() {

        area= length*breadth;
        return area;
    }
    public double calcPerimeter() {

        perimeter=2*(length+breadth);
        return perimeter;
    }
}
