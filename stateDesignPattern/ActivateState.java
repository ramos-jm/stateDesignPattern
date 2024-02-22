package SoftEng2.stateDesignPattern;

public class ActivateState implements AccountState{

    @Override
    public void deposit(double depositAmount, Account account) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("Deposited " + depositAmount + ". Current balance: " + account.getBalance() + "\n" + account.toString());
    }


    @Override
    public void withdraw(double withdrawAmount, Account account) {
        double newBalance = account.getBalance() - withdrawAmount;
        account.setBalance(newBalance >= 0 ? newBalance : account.getBalance());
        System.out.println("Withdrawn " + withdrawAmount + ". Current balance: " + account.getBalance() + "\n" + account.toString());
    }

    @Override
    public void suspendState(Account account) {
        account.setAccountState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    @Override
    public void activateState(Account account) {
        System.out.println("Account is already activated!");
    }

    @Override
    public void closeState(Account account) {
        account.setAccountState(new ClosedState()); // Close the account
        System.out.println("Account is closed!");
    }


}
