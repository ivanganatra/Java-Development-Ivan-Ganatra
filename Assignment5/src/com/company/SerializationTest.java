package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class SerializationTest {

    static ArrayList<Student> allStudents=new ArrayList<Student>(4);

    /**
     * Calls constructor of 4 Student classes
    */
    static void takeInput() throws ParseException
    {
        System.out.println("Enter the following details to store the data of 4 Students:");
        Scanner sc=new Scanner(System.in);
        int st_id=0;
        for(int i=0;i<4;i++) {

            allStudents.add(new Student());
            Student st= allStudents.get(i);
        }
    }

    /**Prints details of all the students*/
    static void printOutput()
    {
        System.out.println("Following are the details of 4 Students:");

        Scanner sc=new Scanner(System.in);
        int st_id=0;
        for(Student st:allStudents) {
            st_id++;
            System.out.println("FOR STUDENT "+st_id+":-");
            System.out.println("FirstName: "+st.first_name);
            System.out.println("Date Of Birth: "+st.date_of_birth);
            System.out.println("\t" + "Address:- ");
            System.out.println("\t" + "City: "+st.address.city);
            System.out.println("\t" + "State: "+st.address.state);
            System.out.println("\t" + "PinCode: "+st.address.pin_code);
            System.out.println("\t" + "Country: "+st.address.country);
        }
    }

    /**Creates a stream to writeObject into 'output1.ser' and 'output2.ser' files*/
    public static void main(String[] args) throws IOException,ParseException{
        takeInput();
        FileOutputStream file = new FileOutputStream("SerializedFile/output2.ser");
        ObjectOutputStream os = new ObjectOutputStream(file);
        for (Student st : allStudents) {
            os.writeObject(st);
        }
        os.close();
        printOutput();
    }
}