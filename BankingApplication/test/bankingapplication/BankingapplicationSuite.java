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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author owner
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({bankingapplication.CheckingAccountTest.class, bankingapplication.BankingApplicationTest.class, bankingapplication.ListOfAccountsTest.class, bankingapplication.SavingsAccountTest.class, bankingapplication.AccountTest.class, bankingapplication.BankAppFrameTest.class})
public class BankingapplicationSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
