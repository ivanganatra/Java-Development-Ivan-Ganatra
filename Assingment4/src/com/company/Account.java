package com.company;

public class Account implements Runnable {
    String name;
    int balance = 100;
    int withdraw = 0;

    @Override
    public void run() {
        boolean process_was_interrupted=false;
        System.out.printf("Your current balance before transaction is: %d\n",this.balance);
        for (int i = 0; i < 4; i++) {

            //If true- Confirms that the code didn't secure the overdraw of the account.
            if(this.balance<0)
            {
                System.out.println("ACCOUNT IS OVERDRAWN!!");
                System.out.println("ACCOUNT IS OVERDRAWN!!");
                System.out.println("ACCOUNT IS OVERDRAWN!!");
                System.out.println("ACCOUNT IS OVERDRAWN!!");
                process_was_interrupted=true;
                break;
            }
            int withdraw_amount = (int) (100.0);
            int prev_balance = this.balance;

            //Ensures that balance never gets zero.
            if (this.balance>=withdraw_amount)
            {
                try{
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){}
                this.balance -= withdraw_amount;
                withdraw+=withdraw_amount;
                System.out.println("Withdraw amount is " + withdraw_amount + ". "
                        +"Your balance amount has changed from "
                        + prev_balance + " to " + this.balance + ".\n"
                        + "Your current thread is " + Thread.currentThread().getName() + "."
                );
            }
            else {
                System.out.println("Sorry, you don't have sufficient balance to withdraw "+withdraw_amount
                        +". Your current balance is "+this.balance +".\n"
                        + "Your current thread is " + Thread.currentThread().getName() + "."
                );
            }
            System.out.printf("Total amount = %d\n\n", this.withdraw);;
        }
        if(process_was_interrupted)
        {
            System.out.println("The withdrawal was terminated due to overdraw.");
        }
        else
        {
            System.out.println("The withdrawal was successfully completed.");
        }
    }
}
