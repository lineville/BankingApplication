
package bankingapplication;


public class SavingsAccount extends Account{
    
    private String accountName;
    private double balance;
    private double fee;
    
    public SavingsAccount(String name, double bal){
        super(name, bal);
        this.fee = 0;
    }
    
    
}
