package com.company;

import java.io.InputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student  implements Serializable {

    public String first_name;
    public String date_of_birth;
    public Address address;
    public static int st_id = 0;
    transient public Date date;

    /**Serial ID to serialize the current version of Student class*/
    private static final long serialVersionUID=10l;

    /**
     * Constructor
     * @error- Parse exception can be thrown by simpleDateFormat.parse();
     * FirstName and DOB is taken as input
     * Constructor of address class is called
     */
    Student() throws ParseException {

        st_id++;
        Student st = this;
        Scanner sc = new Scanner(System.in);

        //Taking Input
        System.out.printf("For student %d :-",st_id);
        System.out.print("FirstName: ");
        st.first_name = sc.next();
        System.out.print("Date Of Birth: ");
        date_of_birth = sc.next();
        date = new SimpleDateFormat("dd/MM/yyyy").parse(date_of_birth);

        //Calling constructor of Address class to input address
        st.address = new Address();
    }
}