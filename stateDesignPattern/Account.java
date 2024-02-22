package SoftEng2.stateDesignPattern;

public class Account {
    private String accountNumber;
    private double balance;
    private AccountState accountState;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActivateState(); // Initial state is Active
    }

    public void deposit(double depositAmount) {
        accountState.deposit(depositAmount, this);
    }

    public void withdraw(double withdrawAmount) {
        accountState.withdraw(withdrawAmount, this);
    }

    public void suspend() {
        accountState.suspendState(this);
    }

    public void activate() {
        accountState.activateState(this);
    }

    public void close() {
        accountState.closeState(this);
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountState getState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    @Override
    public String toString() {
        return  "Account Number= "+ accountNumber + "\t" + "Balance=" + balance + "\n";
    }
}
