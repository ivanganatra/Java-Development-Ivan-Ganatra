package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main_Class {
    static List<String> shapes=new ArrayList<>();
    public static final double pi=3.14;
    static void addShapes()
    {
        shapes= Arrays.asList("Circle", "Rectangle", "Triangle", "Square", "Sphere", "Cylinder",
                "Cuboid", "Cube");
    }
    static void viewAllShapes()
    {
        int id=0;
        for(String s:shapes)
        {
            System.out.print("Id: "+id +") "+s+"\n");
            id+=1; // Move to next id
        }
        System.out.println("\n");
    }
    static void moveToClassOfTheShape(int shape_id)
    {
        System.out.println("You selected "+ shapes.get(shape_id)+" as your shape.");
        switch(shape_id)
        {
            case 0:
            {
                Circle shape=new Circle();
                shape.askInputs();
                shape.printAreaPerimeterVolume();
                break;
            }
            case 1:
            {
                Rectangle shape=new Rectangle();
                shape.askInputs();
                shape.printAreaPerimeterVolume();
                break;
            }
            case 2:
            {
                Triangle shape=new Triangle();
                shape.askInputs();
                shape.printAreaPerimeterVolume();
                break;
            }
            case 3:
            {
                Square shape=new Square();
                shape.askInputs();
                shape.printAreaPerimeterVolume();
                break;
            }
            case 4:
            {
                Sphere shape=new Sphere();
                shape.askInputs();
                shape.printAreaPerimeterVolume();
                break;
            }
            case 5:
            {
                Cylinder shape=new Cylinder();
                shape.askInputs();
                shape.printAreaPerimeterVolume();
                break;
            }
            case 6:
            {
                Cuboid shape=new Cuboid();
                shape.askInputs();
                shape.printAreaPerimeterVolume();
                break;
            }
            case 7:
            {
                Cube shape=new Cube();
                shape.askInputs();
                shape.printAreaPerimeterVolume();
                break;
            }
            default:
            {
                System.out.println("Please enter valid input.");
            }
        }
    }
    public static void main(String []args)
    {

         addShapes();     //Add all the required shapes in the function block
//       viewAllShapes(); //Comment out to view all shapes with their id.

        /*
         * Here we ask user to select the shape.
         * Then we take the input from the user.
         * Shapes are divided into 2 parts: 1)2-D 2)3-D shapes.
         */

         System.out.println("Select the shape to calculate area and perimeters for: ");
         int id=0;

         //Asking for input
         for(String s:shapes)
        {
            System.out.println("Enter "+id+": "+"for "+s+".");
            id+=1; // Move to next id
        }
        //Taking the input
        System.out.print("\n:");
        Scanner sc=new Scanner(System.in);
        int shape_id=sc.nextInt();

        //Taking input and printing output for the shape
        moveToClassOfTheShape(shape_id);

    }
}
