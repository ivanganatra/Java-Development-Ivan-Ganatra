package com.company;

public class Account implements Runnable{
    String name;
    int balance=1000;
    int withdraw=0;

    @Override
    public void run()
    {
        //Job 2
        System.out.println(Thread.currentThread());
        System.out.println("Job 2 Executed");
        for (int i = 0; i < 10; i++) {
            System.out.println("Job 2 Code:" + i + " gets executed.");
        }
    }
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread());

        //Reference of the interface is pointing to the object that
        //implements it.
        Runnable r=new Account();
        Account account=new Account();
        Thread ivan_thread=new Thread(r);
        ivan_thread.start();
        ivan_thread.setName("ivan_thread");
        ivan_thread.setPriority(10);
        //Job 1
        System.out.println("Job 1 Executed");
        for(int i=0;i<10;i++)
        {
            System.out.println("Job 1 Code:"+i+" gets executed.");
        }

    }




}
