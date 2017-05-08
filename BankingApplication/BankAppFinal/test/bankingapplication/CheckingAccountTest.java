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
public class CheckingAccountTest {
    
    public CheckingAccountTest() {
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
     * Test of getCheckingAccountName method, of class CheckingAccount.
     */
    @Test
    public void testGetCheckingAccountName() {
        System.out.println("getCheckingAccountName");
        CheckingAccount instance = new CheckingAccount("Liam", 15.0);
        String expResult = "Liam";
        String result = instance.getCheckingAccountName();
        assertEquals(expResult, result);
    }

    
}
