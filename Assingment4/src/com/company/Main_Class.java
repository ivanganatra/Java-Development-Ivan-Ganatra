package com.company;

import java.util.Scanner;

public class Main_Class {
    static Runnable runnable;
    static boolean exit=false;
    //Synchronized account- Thread Unsafe
    static void unsafeAccount()
    {
        runnable = new Account();
    }
    //Synchronized account- Thread Safe
    static void safeAccount()
    {
        runnable = new Account_Thread_Safe();
    }
    public static void main(String[] args)
    {
        System.out.println("Select the type of the account you want to access:");
        System.out.println("$ Enter 1, to access SAFE account.");
        System.out.println("$ Enter 2, to access UNSAFE account.");
        System.out.println(": ");
        Scanner scanner = new Scanner(System.in);
        int option=scanner.nextInt();
        switch (option)
        {
            case 1:
            {
                safeAccount();
                break;
            }
            case 2:
            {
                unsafeAccount();
                break;
            }
            default:
            {
                exit=true;
                break;
            }
        }
        if(!exit) {
            //Transaction in Account class through different threads
            Thread Ivan_Thread = new Thread(runnable);
            Thread Raj_Thread = new Thread(runnable);
            Ivan_Thread.setName("Ivan_Thread");
            Raj_Thread.setName("Raj_Thread");
            Ivan_Thread.start();
            Raj_Thread.start();
        }
        else
        {
            System.out.println("The process got terminated.");
        }
    }
}
