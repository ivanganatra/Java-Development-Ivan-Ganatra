package com.company;

import java.io.Serializable;
import java.util.Scanner;

public class Address implements Serializable {

    public String city;
    public String state;
    public String country;
    public Integer pin_code;

    /**Serial ID to serialize the current version of Student class*/
    private static final long serialVersionUID=10l;
    /**
     * Constructor
     * To input from user
     * */
    Address(){
        Scanner sc=new Scanner(System.in);
        Address ad=this;

        //Taking Input
        System.out.println("\t" + "Address:- ");
        System.out.print("\t" + "City: ");
        ad.city= sc.next();
        System.out.print("\t" + "State: ");
        ad.state= sc.next();
        System.out.print("\t" + "PinCode: ");
        ad.pin_code= sc.nextInt();
        System.out.print("\t" + "Country: ");
        ad.country= sc.next();
    }
}

