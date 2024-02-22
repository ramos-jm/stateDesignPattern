package stateDesignPattern;

public class ActivateState implements AccountState{
    private final Account account;

    public ActivateState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposited " + amount + ". Current balance: " + account.getBalance());
    }

    @Override
    public void withdraw(double amount) {
        double newBalance = account.getBalance() - amount;
        account.setBalance(newBalance >= 0 ? newBalance : account.getBalance());
        System.out.println("Withdrawn " + amount + ". Current balance: " + account.getBalance());
    }

    @Override
    public void suspendState(AccountState acctState) {
        acctState.suspendState(acctState); // Suspend the account
        System.out.println("Account is suspended!");
    }

    @Override
    public void activateState(AccountState acctState) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void closeState(AccountState acctState) {
        acctState.closeState(acctState); // Close the account
        System.out.println("Account is closed!");
    }

}
