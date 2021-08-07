package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DeserializationTest {
    static ArrayList<Student> allStudents=new ArrayList<Student>(4);

    static void printOutput()
    {
        System.out.println("Following are the details of 4 Students:");

        Scanner sc=new Scanner(System.in);
        int st_id=0;
        for(Student st:allStudents) {
            st_id++;
            System.out.println("FOR STUDENT "+st_id+":-");
            System.out.println("FirstName: "+st.first_name);
            System.out.println("Date Of Birth: "+st.date);
            System.out.println("\t" + "Address:- ");
            System.out.println("\t" + "City: "+st.address.city);
            System.out.println("\t" + "State: "+st.address.state);
            System.out.println("\t" + "PinCode: "+st.address.pin_code);
            System.out.println("\t" + "Country: "+st.address.country);
        }
    }
    public static void main(String[] args) throws IOException {

        /**Choosing desired file for Deserialization*/
        System.out.println("Select the file you want to deserialize: ");
        System.out.println("Enter 1, for 'output1.ser' file.");
        System.out.println("Enter 2, for 'output2.ser' file.");
        System.out.println("'output1.ser' file will be selected by default.");
        Scanner sc=new Scanner(System.in);
        String file_name;
        switch (sc.nextInt())
        {
            case 2:
            {
                file_name="SerializedFile/output2.ser";
                break;
            }
            default:
            {
                file_name="SerializedFile/output1.ser";
                break;
            }
        }
        FileInputStream file = new FileInputStream(file_name);
        ObjectInputStream os = new ObjectInputStream(file);
        for (int i=0;i<4;i++) {
            try {
                allStudents.add((Student) os.readObject());
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        }
        os.close();
        printOutput();
    }
}
