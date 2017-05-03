
package bankingapplication;
import java.util.ArrayList;

public class ListOfAccounts {
    
    private ArrayList<Account> accountList;
    private Account selected;
    
    public ListOfAccounts(){
        
        this.accountList = new ArrayList<>();
        this.selected = null;
    }
    
    /**
     * Adds an account to the list
     * @param a account to be added
     */
    public void addAccount(Account a){
        accountList.add(a);
    }
    
    /**
     * Deletes an account from the list
     * @param a account to be deleted
     */
    public void deleteAccount(Account a){
        accountList.remove(a);
    }
    
    /**
     * Gets the list of accounts
     * @return accountList
     */
    public ArrayList getAccountList(){
        return accountList;
    }
    
    /**
     * Gets the account with this name
     * @param name account name to search for
     * @return an account with accountName matching name
     */
    public Account getAccount(String name){
        Account result = null;
        for(Account a: accountList){
            if(name.equals(a.getAccountName())){
                result = a;
            }
        }
        if(result == null) return new Account("ERROR!!", 0.0);
        return result;
    }
    
    /**
     * Assigns the selected Account
     * @param name the name of the account to select
     */
    public void selectAccount(String name){
        selected = getAccount(name);
        selected.select();
    }
    
    /**
     * Gets the selected account
     * @return selected
     */
    public Account getSelected(){
        return selected;
    }
    /**
     * Gets the list of all the CheckingAccounts
     * @return an ArrayList of the checkingAccounts
     */
    public ArrayList getCheckingAccounts(){
        ArrayList<Account> checking = new ArrayList<Account>();
        for(Account a: accountList){
            if(a.getClass().equals(CheckingAccount.class)){
                checking.add(a);
            }
                
        }
        return checking;
    }
    
    /**
     * Gets the list of all the SavingsAccounts
     * @return an ArrayList of the savingsAccounts
     */
    public ArrayList getSavingsAccounts(){
        ArrayList<Account> savings = new ArrayList<Account>();
        for(Account a: accountList){
            if(a.getClass().equals(SavingsAccount.class)){
                savings.add(a);
            }
               
        }
        return savings;
    }
    
    
    /**
     * Converts the list to a string
     * @return 
     */
    public String toString(){
        String result = "Account Name     Balance \n".toUpperCase();
        for(Account a: accountList){
            result += a.toString();
        }
        return result;
    }
}
