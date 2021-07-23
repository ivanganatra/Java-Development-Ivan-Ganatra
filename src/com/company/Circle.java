package com.company;
import java.util.Scanner;
class Circle implements Shape{
    double radius;
    double area;
    double perimeter;
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
    public double calcArea(){

        area= Main_Class.pi*radius*radius;
        return area;
    }
    public double calcPerimeter()
    {
        perimeter=2*Main_Class.pi*radius;
        return perimeter;
    }
}
