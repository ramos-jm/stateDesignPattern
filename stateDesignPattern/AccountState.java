package SoftEng2.stateDesignPattern;

public interface AccountState {
    public void deposit(double depositAmount, Account account);
    public void withdraw(double withdrawAmount, Account account);
    public void suspendState(Account account);
    public void activateState(Account account);
    public void closeState(Account account);

}
