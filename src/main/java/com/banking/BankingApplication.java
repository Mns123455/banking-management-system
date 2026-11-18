
package com.banking;

public class BankingApplication {

    public static void main(String[] args) {

        String customer = "Manohar";
        int accountNumber = 1001;
        double balance = 50000.00;

        System.out.println("BANKING MANAGEMENT SYSTEM");
        System.out.println("-------------------------");

        System.out.println("Customer Name: " + customer);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Opening Balance: " + balance);

        double deposit = 10000.00;
        balance = balance + deposit;

        System.out.println("Deposit Amount: " + deposit);
        System.out.println("Available Balance: " + balance);

        double withdrawal = 5000.00;

        if (withdrawal <= balance) {
            balance = balance - withdrawal;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }

        System.out.println("Final Balance: " + balance);
    }
}
