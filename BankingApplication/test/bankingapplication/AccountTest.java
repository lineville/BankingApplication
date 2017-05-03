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
        double cash = 10;
        Account instance = new Account("Cole", 120.0);
        double expResult = instance.viewBalance() + 10.0;
        instance.deposit(cash);
        double result = instance.viewBalance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        double cash = 15.0;
        Account instance = new Account("Liam", 20.0);
        double expResult = instance.viewBalance() - 15.0;
        instance.withdraw(cash);
        double result = instance.viewBalance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of viewBalance method, of class Account.
     */
    @Test
    public void testViewBalance() {
        System.out.println("viewBalance");
        Account instance = new Account("Liam", 50.0);
        double expResult = 50.0;
        double result = instance.viewBalance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getAccountName method, of class Account.
     */
    @Test
    public void testGetAccountName() {
        System.out.println("getAccountName");
        Account instance = new Account("Liam", 50.0);
        String expResult = "Liam";
        String result = instance.getAccountName();
        assertEquals(expResult, result);
    }
    
}
