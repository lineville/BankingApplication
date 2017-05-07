/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapplication;

import javax.swing.JTextArea;
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
public class BankAppFrameTest {
    
    public BankAppFrameTest() {
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
     * Test of getDisplay method, of class BankAppFrame.
     */
    @Ignore
    @Test
    public void testGetDisplay() {
        System.out.println("getDisplay");
        BankAppFrame instance = null;
        JTextArea expResult = null;
        JTextArea result = instance.getDisplay();
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class BankAppFrame.
     */
    @Ignore
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        BankAppFrame.main(args);
    }
    
}
