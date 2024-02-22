package SoftEng2.stateDesignPattern;

public class SuspendedState implements AccountState{


    @Override
    public void deposit(double depositAmount, Account account) {
        System.out.println("Cannot deposit to a suspended account!");
        account.toString();
    }

    @Override
    public void withdraw(double withdrawAmount, Account account) {
        System.out.println("Cannot withdraw from a suspended account!");
        account.toString();
    }

    @Override
    public void suspendState(Account account) {
        System.out.println("Account is already suspended!");
    }

    @Override
    public void activateState(Account account) {
        account.setAccountState(new ActivateState()); // Activate the account
        System.out.println("Account is activated!");
    }

    @Override
    public void closeState(Account account) {
        account.setAccountState(new ClosedState()); // Close the account
        System.out.println("Account is closed!");
    }
}
