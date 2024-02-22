package stateDesignPattern;

public interface AccountState {
    public void deposit(double amount);
    public void withdraw(double amount);
    public void suspendState(AccountState acctState);
    public void activateState(AccountState acctState);
    public void closeState(AccountState acctState);

}
