class CheckingAccount extends BankAccount {
    private SavingsAccount linkedSavingsAccount;

    public CheckingAccount(String owner, SavingsAccount savingsAccount) {
        super(owner);
        this.linkedSavingsAccount = savingsAccount;
    }


    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else if (linkedSavingsAccount != null && amount <= balance + linkedSavingsAccount.balance) {
            System.out.println("Withdrawal from savings to cover checking balance");
            double remainingAmount = amount - balance;
            balance = 0;
            linkedSavingsAccount.withdraw(remainingAmount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}