class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String owner) {
        super(owner);
    }

    public void payInterest() {
        balance += balance * interestRate;
    }

    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }
}