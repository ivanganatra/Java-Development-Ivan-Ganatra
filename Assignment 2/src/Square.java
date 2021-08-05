package com.company;

import java.util.Scanner;
class Square implements Shape {
    double side;
    double area;
    double perimeter;
    public boolean askInputs() {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter side: ");
        side=sc.nextDouble();

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
    public double calcArea() {

        area= side*side;
        return area;
    }
    public double calcPerimeter() {

        perimeter=4*side;
        return perimeter;
    }
}
