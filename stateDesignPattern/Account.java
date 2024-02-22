package stateDesignPattern;

public class Account {
    private String accountNumber;
    private double balance;
    private AccountState state;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.state = new ActivateState(this); // Initial state is Active
    }

    public void deposit(double amount) {
        state.deposit(amount);
    }

    public void withdraw(double amount) {
        state.withdraw(amount);
    }

    public void suspend() {
        state.suspendState(new SuspendedState(this));
    }

    public void activate() {
        state.activateState(new ActivateState(this));
    }

    public void close() {
        state.closeState(new ClosedState(this));
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
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return  "Account Number= "+ accountNumber + "\t" + "Balance=" + balance;
    }
}
