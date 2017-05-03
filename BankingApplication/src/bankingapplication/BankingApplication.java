package bankingapplication;

import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Liam Neville
 */
public class BankingApplication {
    

    public static void main(String[] args) {

        //Create several checking and savings accounts
        CheckingAccount check = new CheckingAccount("Checking", 100000);
        CheckingAccount spending = new CheckingAccount("Spending Money", 123423.20);
        CheckingAccount groceries = new CheckingAccount("Grocery Fund", 1000);
        CheckingAccount holiday = new CheckingAccount("Holiday Fund", 7823432.90);
        
        SavingsAccount college = new SavingsAccount("College Savings", 80903.35);
        SavingsAccount mortgage = new SavingsAccount("Mortgage Savings", 1234);
        SavingsAccount business = new SavingsAccount("Business Savings", 8934.90);
        SavingsAccount insurance = new SavingsAccount("insurance Savings", 8032423);

        ListOfAccounts listy = new ListOfAccounts();
        //Populate the list
        listy.addAccount(check);
        listy.addAccount(spending);
        listy.addAccount(groceries);
        listy.addAccount(holiday);
        listy.addAccount(college);
        listy.addAccount(mortgage);
        listy.addAccount(business);
        listy.addAccount(insurance);
        
        BankAppFrame b = new BankAppFrame(listy);
        b.main(args);
        
    }

}
