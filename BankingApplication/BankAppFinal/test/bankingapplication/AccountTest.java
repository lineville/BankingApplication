/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapplication;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author owner
 */
public class AccountTest {
    
    public AccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of deposit method, of class Account.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        String cash = "10.0";
        Account instance = new Account("Liam", 15.0, "Checking");
        double expResult = instance.viewBalance() + 10.0;
        instance.deposit(cash);
        double result = instance.viewBalance();
        assertEquals(expResult,result, 0.0);
        
    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        String cash = "10.0";
        Account instance = new Account("Liam", 30.0, "Checking");
        double expResult = instance.viewBalance() - 10.0;
        instance.withdraw(cash);
        double result = instance.viewBalance();
        assertEquals(expResult,result, 0.0);
    }

    /**
     * Test of viewBalance method, of class Account.
     */
    @Test
    public void testViewBalance() {
        System.out.println("viewBalance");
        Account instance = new Account("Liam", 30.0, "Checking");
        double expResult = 30.0;
        double result = instance.viewBalance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getAccountName method, of class Account.
     */
    @Test
    public void testGetAccountName() {
        System.out.println("getAccountName");
        Account instance = new Account("Liam", 30.0, "Checking");
        String expResult = "Liam";
        String result = instance.getAccountName();
        assertEquals(expResult, result);
    }

    /**
     * Test of isSelected method, of class Account.
     */
    @Test
    public void testIsSelected() {
        System.out.println("isSelected");
        Account instance = new Account("Liam", 30.0, "Checking");
        boolean expResult = false;
        boolean result = instance.isSelected();
        assertEquals(expResult, result);
    }

    /**
     * Test of select method, of class Account.
     */
    @Test
    public void testSelect() {
        System.out.println("select");
        Account instance = new Account("Liam", 30.0, "Checking");
        instance.select();
        boolean result = instance.isSelected();
        assertTrue(result);
    }


    /**
     * Test of getType method, of class Account.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Account instance = new CheckingAccount("Test", 30.0);
        Account instance2 = new Account("Test2", 20.0, "Checking");
        String expResult = "Checking";
        String result = instance.getType();
        String result2 = instance2.getType();
        assertEquals(expResult, result);
        assertEquals(expResult, result2);
    }

    /**
     * Test of isChecking method, of class Account.
     */
    @Test
    public void testIsChecking() {
        System.out.println("isChecking");
        Account instance = new Account("Test", 20.0, "Checking");
        Account instance2 = new Account("Test2", 15.0, "Savings");
        boolean expResult = true;
        boolean result2 = instance2.isChecking();
        boolean result = instance.isChecking();
        assertEquals(expResult, result);
        assertFalse(result2);
    }

    /**
     * Test of isSavings method, of class Account.
     */
    @Test
    public void testIsSavings() {
        System.out.println("isSavings");
        Account instance = new Account("Test", 20.0, "Savings");
        Account instance2 = new Account("Test2", 15.0, "Checking");
        boolean expResult = true;
        boolean result = instance.isSavings();
        boolean result2 = instance2.isSavings();
        assertEquals(expResult, result);
        assertFalse(result2);
    }

    /**
     * Test of cashString method, of class Account.
     */
    @Test
    public void testCashString() {
        System.out.println("cashString");
        Account instance = new Account("Liam", 30.0, "Checking");
        String expResult = "$ 30.00";
        String result = instance.cashString();
        assertEquals(expResult, result);
    }
    
}
