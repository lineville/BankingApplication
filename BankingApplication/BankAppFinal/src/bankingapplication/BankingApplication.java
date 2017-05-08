package bankingapplication;

/**
 *
 * @author Liam Neville
 */
public class BankingApplication {
    

    public static void main(String[] args) {

        //Create several checking and savings accounts
        CheckingAccount check = new CheckingAccount("Checking Account", 1000);
        CheckingAccount spending = new CheckingAccount("Spending Money", 1500);
        CheckingAccount groceries = new CheckingAccount("Grocery Fund", 3000);
        CheckingAccount holiday = new CheckingAccount("Holiday Fund", 300);
        
        SavingsAccount college = new SavingsAccount("College Savings", 75000);
        SavingsAccount mortgage = new SavingsAccount("Mortgage Savings", 50000);
        SavingsAccount business = new SavingsAccount("Business Savings", 7000000);
        SavingsAccount insurance = new SavingsAccount("Insurance Savings", 900000);

        ListOfAccounts listy = new ListOfAccounts();
       
        //Populate the list of accounts
        listy.addAccount(check);
        listy.addAccount(spending);
        listy.addAccount(groceries);
        listy.addAccount(holiday);
        listy.addAccount(college);
        listy.addAccount(mortgage);
        listy.addAccount(business);
        listy.addAccount(insurance);
        
        //Create new BankAppFrame and give it the list and start it
        BankAppFrame b = new BankAppFrame(listy);
        b.main(args);
        
    }

}
