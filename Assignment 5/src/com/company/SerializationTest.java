package com.company;

import java.io.*;
import java.util.ArrayList;

public class SerializationTest {

    ArrayList<Student> allStudents=new ArrayList<Student>(4);

    public static void main(String[] args) throws IOException
    {
        FileOutputStream file=new FileOutputStream("src/com/company/input.txt");
        ObjectOutputStream os=new ObjectOutputStream(file);
        Student new_student=new Student();
        os.writeObject(new_student);

    }
}
