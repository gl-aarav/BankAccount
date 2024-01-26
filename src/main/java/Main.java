//Tester Class
public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("Saver");
        CheckingAccount checkingAccount = new CheckingAccount("Spender", savingsAccount);

        savingsAccount.deposit(1000);
        checkingAccount.deposit(500);

        checkingAccount.reportBalance(); 
        checkingAccount.withdraw(200);   
        checkingAccount.reportBalance(); 

        checkingAccount.withdraw(400);   
        checkingAccount.reportBalance(); 

        savingsAccount.reportBalance();  
    }
}
