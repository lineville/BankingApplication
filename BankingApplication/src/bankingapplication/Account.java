
package bankingapplication;


public class Account {
    
    private String accountName;
    private double balance;
    private double fee;
    private boolean selected;
    
    /**
     * Constructs an Account object
     * @param name Name on the account
     * @param bal value of the balance
     */
    public Account(String name, Double bal){
        
        this.accountName = name;
        this.balance = bal;
        this.selected = false;
    }
    
    /**
     * Transaction fee Free
     * Adds cash to the balance
     * @param cash to be added to the balance
     */
    public void deposit(double cash){
        balance += cash;
    }
    
    /**
     * Transaction fee Free
     * Takes out cash from the balance
     * @param cash to be taken out of balance
     */
    public void withdraw(double cash){
        balance -= (cash + fee);
    }
    
    /**
     * Gets the current balance
     * @return balance
     */
    public double viewBalance(){
        return balance;
    }
    
    /**
     * Gets the accountName
     * @return accountName
     */
    public String getAccountName(){
        return accountName;
    }
    
    /**
     * Determines if this account has been selected
     * @return selected
     */
    public boolean isSelected(){
        return selected;
    }
    
    /**
     * Selects this account
     */
    public void select(){
        selected = true;
    }
    
    /**
     * Converts this account to a string
     * @return string of account
     */
    public String toString(){
        return accountName + " " + 
                " $" + balance + "\n";
    }
}
