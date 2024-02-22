package stateDesignPattern;

public class SuspendedState implements AccountState{
    private final Account account;

    public SuspendedState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Cannot deposit to a suspended account!");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Cannot withdraw from a suspended account!");
    }

    @Override
    public void suspendState(AccountState acctState) {
        System.out.println("Account is already suspended!");
    }

    @Override
    public void activateState(AccountState acctState) {
        acctState.activateState(acctState); // Activate the account
        System.out.println("Account is activated!");
    }

    @Override
    public void closeState(AccountState acctState) {
        acctState.closeState(acctState); // Close the account
        System.out.println("Account is closed!");
    }
}
