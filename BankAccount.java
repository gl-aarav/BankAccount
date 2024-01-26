class BankAccount {
    protected String owner;
    protected double balance;
    private static int nextAccountNumber = 1;
    protected int accountNumber;

    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0.0;
        this.accountNumber = nextAccountNumber++;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void reportBalance() {
        System.out.println("Balance: $" + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}