package com.company;

import java.util.Scanner;
class Triangle implements Shape {
    double height;
    double base;
    double side1;
    double side2;
    double side3;
    double area;
    double perimeter;
    public boolean askInputs() {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base: ");
        base=sc.nextDouble();
        System.out.print("Enter height: ");
        height=sc.nextDouble();
        side1=base;
        System.out.print("Enter second side: ");
        side2=sc.nextDouble();
        System.out.print("Enter third side: ");
        side3=sc.nextDouble();

        //return false if there is a error in the input
        if(((side1+side2)<=side3)||((side2+side3)<=side1)||((side1+side3)<=side2)|| side1==0 || side2==0 || side3==0)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
    public double calcArea() {

        area= (base*height)/2;
        return area;
    }
    public double calcPerimeter() {

        perimeter=side1+side2+side3;
        return perimeter;
    }
}
