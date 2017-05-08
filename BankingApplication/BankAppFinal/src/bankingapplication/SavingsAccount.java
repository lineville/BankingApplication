
package bankingapplication;


public class SavingsAccount extends Account{
    
    
    
    /**
     * Constructs a SavingsAccount
     * @param name account name
     * @param bal initial balance
     */
    public SavingsAccount(String name, double bal){
        super(name, bal, "Savings");
        this.fee = 0;
    }
    
    /**
     * Gets the accountName
     * @return accountName
     */
    public String getSavingsAccountName(){
        return super.getAccountName();
    }
    
    
    
    
}
