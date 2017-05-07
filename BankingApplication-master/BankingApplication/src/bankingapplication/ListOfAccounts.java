
package bankingapplication;
import java.util.ArrayList;

public class ListOfAccounts {
    
    private final ArrayList<Account> accountList;
    private Account selected;
    private boolean checkingMode;
    private boolean savingsMode;
    private boolean allMode;
    
    /**
     * Constructs and empty list of accounts
     */
    public ListOfAccounts(){
        
        this.accountList = new ArrayList<>();
        this.selected = null;
        this.allMode = true;
        this.checkingMode = false;
        this.savingsMode = false;
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
        if(result == null) return new Account("ERROR!!", 0.0, "Not an Account");
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
    public ListOfAccounts getCheckingAccounts(){
        ListOfAccounts checking = new ListOfAccounts();
        for(Account a: accountList){
            if(a.isChecking()){
                checking.addAccount(a);
            }
                
        }
        return checking;
    }
    
    /**
     * Gets the list of all the SavingsAccounts
     * @return an ArrayList of the savingsAccounts
     */
    public ListOfAccounts getSavingsAccounts(){
        ListOfAccounts savings = new ListOfAccounts();
        for(Account a: accountList){
            if(a.isSavings()){
                savings.addAccount(a);
            }
               
        }
        return savings;
    }
    
    /**
     * Turns savingsMode to true
     */
    public void savingsModeOn(){
        savingsMode = true;
        
    }
    
    /**
     * Turns savingsMode to false
     */
    public void savingsModeOff(){
        savingsMode = false;
        
    }
    
    /**
     * Turns checkingMode to ture
     */
    public void checkingModeOn(){
        checkingMode = true;
    }
    
    /**
     * Turns checkingMode to false
     */
    public void checkingModeOff(){
        checkingMode = false;
    }
    
    /**
     * Turns allMode to true
     */
    public void allModeOn(){
        allMode = true;
    }
    
    /**
     * Turns allMode to false
     */
    public void allModeOff(){
        allMode = false;
    }
    
    /**
     * Determines if in checkingMode
     * @return true if in checkingMode 
     */
    public boolean isCheckingMode(){
        return checkingMode;
    }
    
    /**
     * Determines if in savingsMode
     * @return true if in savingsMode
     */
    public boolean isSavingsMode(){
        return savingsMode;
    }
    
    /**
     * Determines if in allMode
     * @return true if in allMode
     */
    public boolean isAllMode(){
        return allMode;
    }
            
    /**
     * Converts the list to a string
     * @return 
     */
    public String nameToString(){
        String result = "Account Name \n".toUpperCase();
        for(Account a: accountList){
            result += a.getAccountName() + "\n";
        }
        return result;
    }
    
    public String balsToString(){
        String result = "Balance \n".toUpperCase();
        for(Account a: accountList){
            result += a.cashString() + "\n";
        }
        return result;
    }
}
