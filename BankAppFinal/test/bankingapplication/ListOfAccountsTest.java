/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapplication;

import java.util.ArrayList;
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
public class ListOfAccountsTest {
    
    public ListOfAccountsTest() {
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
     * Test of addAccount method, of class ListOfAccounts.
     */
    @Test
    public void testAddAccount() {
        System.out.println("addAccount");
        Account a = new Account("Liam", 30.0, "Checking");
        ListOfAccounts instance = new ListOfAccounts();
        instance.addAccount(a);
        ArrayList<Account> list = instance.getAccountList();
        Account result = list.get(0);
        assertEquals(a, result);
    }

    /**
     * Test of deleteAccount method, of class ListOfAccounts.
     */
    @Test
    public void testDeleteAccount() {
        System.out.println("deleteAccount");
        Account a = new Account("Liam", 30.0, "Checking");
        ListOfAccounts instance = new ListOfAccounts();
        instance.addAccount(a);
        instance.deleteAccount(a);
        String result = instance.getAccount("Liam").getAccountName();
        String error = "Sorry, Couldn't Find that Account!";
        assertEquals(result, error);
    }

    /**
     * Test of getAccountList method, of class ListOfAccounts.
     */
    @Test
    public void testGetAccountList() {
        System.out.println("getAccountList");
        ListOfAccounts instance = new ListOfAccounts();
        CheckingAccount c = new CheckingAccount("Liam", 30.0);
        CheckingAccount b = new CheckingAccount("Liam2", 30.0);
        SavingsAccount s = new SavingsAccount("Liam3", 30.0);
        instance.addAccount(c);
        instance.addAccount(b);
        instance.addAccount(s);
        ArrayList<Account> expResult = new ArrayList<>();
        expResult.add(c);
        expResult.add(b);
        expResult.add(s);
        ArrayList result = instance.getAccountList();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAccount method, of class ListOfAccounts.
     */
    @Test
    public void testGetAccount() {
        System.out.println("getAccount");
        String name = "Liam";
        Account liam = new Account("Liam", 30.0, "Checking");
        ListOfAccounts instance = new ListOfAccounts();
        instance.addAccount(liam);
        String expResult = liam.getAccountName();
        String result = instance.getAccount(name).getAccountName();
        assertEquals(expResult, result);
    }

    /**
     * Test of selectAccount method, of class ListOfAccounts.
     */
    @Test
    public void testSelectAccount() {
        System.out.println("selectAccount");
        String name = "Liam";
        Account liam = new Account("Liam", 30.0, "Checking");
        ListOfAccounts instance = new ListOfAccounts();
        instance.addAccount(liam);
        instance.selectAccount(name);
        boolean result = liam.isSelected();
        assertTrue(result);
    }

    /**
     * Test of getSelected method, of class ListOfAccounts.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        ListOfAccounts instance = new ListOfAccounts();
        Account liam = new Account("Liam", 30.0, "Checking");
        instance.addAccount(liam);
        instance.selectAccount("Liam");
        String expResult = liam.getAccountName();
        String result = instance.getSelected().getAccountName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCheckingAccounts method, of class ListOfAccounts.
     */
    @Test
    public void testGetCheckingAccounts() {
        System.out.println("getCheckingAccounts");
        ListOfAccounts instance = new ListOfAccounts();
        CheckingAccount c = new CheckingAccount("Liam", 30.0);
        CheckingAccount b = new CheckingAccount("Liam2", 30.0);
        SavingsAccount s = new SavingsAccount("Liam3", 30.0);
        instance.addAccount(c);
        instance.addAccount(b);
        instance.addAccount(s);
        ArrayList<Account> expResult = new ArrayList<>();
        expResult.add(c);
        expResult.add(b);
        ArrayList result = instance.getCheckingAccounts().getAccountList();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSavingsAccounts method, of class ListOfAccounts.
     */
    @Test
    public void testGetSavingsAccounts() {
        System.out.println("getSavingsAccounts");
        ListOfAccounts instance = new ListOfAccounts();
        CheckingAccount c = new CheckingAccount("Liam", 30.0);
        CheckingAccount b = new CheckingAccount("Liam2", 30.0);
        SavingsAccount s = new SavingsAccount("Liam3", 30.0);
        instance.addAccount(c);
        instance.addAccount(b);
        instance.addAccount(s);
        ArrayList<Account> expResult = new ArrayList<>();
        expResult.add(s);
        ArrayList result = instance.getSavingsAccounts().getAccountList();
        assertEquals(expResult, result);
    }

    /**
     * Test of savingsModeOn method, of class ListOfAccounts.
     */
    @Test
    public void testSavingsModeOn() {
        System.out.println("savingsModeOn");
        ListOfAccounts instance = new ListOfAccounts();
        instance.savingsModeOn();
        boolean result = instance.isSavingsMode();
        assertTrue(result);
    }

    /**
     * Test of savingsModeOff method, of class ListOfAccounts.
     */
    @Test
    public void testSavingsModeOff() {
        System.out.println("savingsModeOff");
        ListOfAccounts instance = new ListOfAccounts();
        instance.savingsModeOff();
        boolean result = instance.isSavingsMode();
        assertFalse(result);
    }

    /**
     * Test of checkingModeOn method, of class ListOfAccounts.
     */
    @Test
    public void testCheckingModeOn() {
        System.out.println("checkingModeOn");
        ListOfAccounts instance = new ListOfAccounts();
        instance.checkingModeOn();
        boolean result = instance.isCheckingMode();
        assertTrue(result);
    }

    /**
     * Test of checkingModeOff method, of class ListOfAccounts.
     */
    @Test
    public void testCheckingModeOff() {
        System.out.println("checkingModeOff");
        ListOfAccounts instance = new ListOfAccounts();
        instance.checkingModeOff();
        boolean result = instance.isCheckingMode();
        assertFalse(result);
    }

    /**
     * Test of allModeOn method, of class ListOfAccounts.
     */
    @Test
    public void testAllModeOn() {
        System.out.println("allModeOn");
        ListOfAccounts instance = new ListOfAccounts();
        instance.allModeOn();
        boolean result = instance.isAllMode();
        assertTrue(result);
    }

    /**
     * Test of allModeOff method, of class ListOfAccounts.
     */
    @Test
    public void testAllModeOff() {
        System.out.println("allModeOff");
        ListOfAccounts instance = new ListOfAccounts();
        instance.allModeOff();
        boolean result = instance.isAllMode();
        assertFalse(result);
    }

    /**
     * Test of isCheckingMode method, of class ListOfAccounts.
     */
    @Test
    public void testIsCheckingMode() {
        System.out.println("isCheckingMode");
        ListOfAccounts instance = new ListOfAccounts();
        boolean expResult = false;
        boolean result = instance.isCheckingMode();
        assertEquals(expResult, result);
        instance.checkingModeOn();
        boolean result2 = instance.isCheckingMode();
        assertTrue(result2);
    }

    /**
     * Test of isSavingsMode method, of class ListOfAccounts.
     */
    @Test
    public void testIsSavingsMode() {
        System.out.println("isSavingsMode");
        ListOfAccounts instance = new ListOfAccounts();
        boolean expResult = false;
        boolean result = instance.isSavingsMode();
        assertEquals(expResult, result);
        instance.savingsModeOn();
        boolean result2 = instance.isSavingsMode();
        assertTrue(result2);
    }

    /**
     * Test of isAllMode method, of class ListOfAccounts.
     */
    @Test
    public void testIsAllMode() {
        System.out.println("isAllMode");
        ListOfAccounts instance = new ListOfAccounts();
        boolean expResult = true;
        boolean result = instance.isAllMode();
        assertEquals(expResult, result);
        instance.allModeOff();
        boolean result2 = instance.isAllMode();
        assertFalse(result2);
    }

    /**
     * Test of nameToString method, of class ListOfAccounts.
     */
    @Test
    public void testNameToString() {
        System.out.println("nameToString");
        ListOfAccounts instance = new ListOfAccounts();
        Account a = new Account("Liam", 30.0, "Checking");
        Account b = new Account("Tom", 30.0, "Checking");
        instance.addAccount(a);
        instance.addAccount(b);
        String expResult = "ACCOUNT NAME \n-------------------------\n"
                + "Liam\nTom\n";
        String result = instance.nameToString();
        assertEquals(expResult, result);
    }

    /**
     * Test of balsToString method, of class ListOfAccounts.
     */
    @Test
    public void testBalsToString() {
        System.out.println("balsToString");
        ListOfAccounts instance = new ListOfAccounts();
        Account a = new Account("Liam", 30.0, "Checking");
        Account b = new Account("Tom", 30.0, "Checking");
        instance.addAccount(a);
        instance.addAccount(b);
        String expResult = "BALANCE \n---------------\n" + "$ 30.00\n" + "$ 30.00\n";
        String result = instance.balsToString();
        assertEquals(expResult, result);
    }
    
}
