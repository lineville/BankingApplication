
package bankingapplication;


public class CheckingAccount extends Account{
    
    /**
     * Constructs a CheckingAccount
     * @param name account name
     * @param bal initial balance
     */
    public CheckingAccount(String name, double bal){
        super(name, bal,"Checking");
        this.fee = 0.10;
        
    }
    
    /**
     * Gets the accountName;
     * @return accountName
     */
    public String getCheckingAccountName(){
        return super.getAccountName();
    }
   
    
}
