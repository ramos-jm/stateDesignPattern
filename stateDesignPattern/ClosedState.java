package stateDesignPattern;

public class ClosedState implements AccountState{
    private final Account account;

    public ClosedState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Cannot deposit to a closed account!");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Cannot withdraw from a closed account!");
    }

    @Override
    public void suspendState(AccountState acctState) {
        System.out.println("You cannot suspend a closed account!");
    }

    @Override
    public void activateState(AccountState acctState) {
        System.out.println("You cannot activate a closed account!");
    }

    @Override
    public void closeState(AccountState acctState) {
        System.out.println("Account is already closed!");
    }
}
