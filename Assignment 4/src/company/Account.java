package com.company;

public class Account implements Runnable{
    String name;
    int balance=1000;
    int withdraw=0;

    @Override
    public void run()
    {
        for(int i=0;i<20;i++)
        {
            int withdraw_amount= (int) (200.0*Math.random());
            int prev_balance = this.balance;
            if(withdraw_amount>=this.balance)
            {
                this.balance-=withdraw_amount;
                System.out.println("Your balance amount has changed from "
                        +prev_balance+" to "+ this.balance+"."
                        +"Withdraw amount is "+ withdraw_amount+".\n"
                        + "Your current thread is " +Thread.currentThread().getName()+".\n"
                );
            }
            else
            {
                System.out.println("Your balance amount has changed from "
                        +prev_balance+" to "+ this.balance+"."
                        +"Withdraw amount is "+ withdraw_amount+".\n"
                        + "Your current thread is " +Thread.currentThread().getName()+".\n"
                );
            }
        }
    }
//    public void withdrawAmount(int amount)
//    {
//        if(amount>=balance)
//        {
//            balance-=amount;
//        }
//        else
//        {
//            System.out.println("You don't have sufficient amount of balance.");
//        }
//
//    }
}
