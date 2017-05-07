
package bankingapplication;


public class Account {
    
    
    private final String accountName;
    private double balance;
    protected double fee;
    private boolean selected;
    private final String type; //Either "Checking" or "Savings"
    
    /**
     * Constructs an Account object
     * @param name Name on the account
     * @param bal value of the balance
     * @param t of account either "Checking" or "Savings"
     */
    public Account(String name, Double bal, String t){
        
        this.accountName = name;
        this.balance = bal;
        this.selected = false;
        this.type = t;
    }
    
    /**
     * Transaction fee Free
     * Adds cash to the balance
     * @param in to be added to the balance
     */
    public void deposit(String in){
        balance += Double.parseDouble(in);
    }
    
    /**
     * Transaction fee Free
     * Takes out cash from the balance
     * @param in to be taken out of balance
     */
    public void withdraw(String in){
        balance -= (Double.parseDouble(in) + fee);
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
     * Gets the type of the account
     * @return the type
     */
    public String getType(){
        return type;
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
     * Determines if the account is a checkingAccount
     * @return true if checking false otherwise
     */
    public boolean isChecking(){
        return type.equals("Checking");
    }
    
    /**
     * Determines if the account is a savingsAccount
     * @return true if savings false otherwise
     */
    public boolean isSavings(){
        return type.equals("Savings");
    }
    
    public String cashString(){
        return "$ " + balance;
    }
    
}
