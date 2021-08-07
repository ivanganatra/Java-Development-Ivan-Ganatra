package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main_Class {
    static List<String> shapes_name=new ArrayList<>();
    public static final double pi=3.14;
    static void viewAllShapesName()
    {
        int id=0;
        for(String s:shapes_name)
        {
            System.out.print("Id: "+id +") "+s+"\n");
            id+=1; // Move to next id
        }
        System.out.println("\n");
    }
    static void printAreaPerimeterVolume(Shape shape,String shape_name, boolean is2D) {

        //Error to be caught-Calling (surfaceAre,Volume) for 2D and (Area,Perimeter) for 3D figures
        try {
            if (is2D == false) {
                System.out.println("SurfaceArea of the " + shape_name + " is :" + shape.calcSurfaceArea());
                System.out.println("Volume of the " + shape_name + " is :" + shape.calcVolume());
            } else {
                System.out.println("Area of the " + shape_name + " is :" + shape.calcArea());
                System.out.println("Perimeter of the " + shape_name + " is :" + shape.calcPerimeter());
            }
            System.out.println("");
        }
        catch(Exception e)
        {
            System.out.println("Incorrect function calls, function should be called according to the 2D and 3D figures.");
        }
    }
    static boolean moveToClassOfTheShape(int shape_id)
    {
        System.out.println("You selected "+ shapes_name.get(shape_id)+" as your shape.");
        boolean is2D=false;
        Shape shape=new Circle();
        boolean isValidInput=true;

        //Selecting the shape of Class as per the options selected by the user
        switch(shape_id)
        {
            case 0:
            {
                shape=new Circle();
                is2D=true;
                break;
            }
            case 1:
            {
                shape=new Rectangle();
                is2D=true;
                break;
            }
            case 2:
            {
                shape=new Triangle();
                is2D=true;
                break;
            }
            case 3:
            {
                shape=new Square();
                is2D=true;
                break;
            }
            case 4:
            {
                shape=new Sphere();
                is2D=false;
                break;
            }
            case 5:
            {
                shape=new Cylinder();
                is2D=false;
                break;
            }
            case 6:
            {
                shape=new Cuboid();
                is2D=false;
                break;
            }
            case 7:
            {
                shape=new Cube();
                is2D=false;
                break;
            }
            default:
            {
                isValidInput=false;
            }
        }
        isValidInput|=shape.askInputs();
        if(!isValidInput)
        {
            System.out.println("Please enter valid input.");
            isValidInput=false;
            return false;
        }
        printAreaPerimeterVolume(shape, shapes_name.get(shape_id), false);
        return true;
    }
    public static void main(String []args)
    {
        shapes_name= Arrays.asList("Circle", "Rectangle", "Triangle", "Square", "Sphere", "Cylinder",
                "Cuboid", "Cube");
        //viewAllShapesName(); //Comment out to view all shapes_name with their id.0
        int shape_id;
        String isQuery;
        do{

            //Asking for query
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter 1 to ask a query: ");
            isQuery=sc.next();
            if(!isQuery.equals("1")) {
                break;
            }

            //Asking for input
            System.out.println("Select the shape to calculate (area,perimeters) or (surface area,volume) : ");
            int id=0;
            for(String s:shapes_name)
            {
                System.out.println("Enter "+id+": "+"for "+s+".");
                id+=1; // Move to next id
            }

            //Taking the input
            System.out.print("\n:");
            shape_id=sc.nextInt();
        }
        while(moveToClassOfTheShape(shape_id));  //Printing output for the shape
    }
}