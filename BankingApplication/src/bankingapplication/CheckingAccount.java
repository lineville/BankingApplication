
package bankingapplication;


public class CheckingAccount extends Account{
    
    private String accountName;
    private double balance;
    private final double fee;
    
    public CheckingAccount(String name, double bal){
        super(name, bal);
        this.fee = 0.10;
        
    }
   
    
}
