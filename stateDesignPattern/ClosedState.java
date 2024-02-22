package SoftEng2.stateDesignPattern;

public class ClosedState implements AccountState{


    @Override
    public void deposit(double depositAmount, Account account) {
        System.out.println("Cannot deposit to a closed account!\n"+account.toString());

    }

    @Override
    public void withdraw(double withdrawAmount, Account account) {
        System.out.println("Cannot withdraw from a closed account!\n"+account.toString());

    }

    @Override
    public void suspendState(Account account) {
        System.out.println("You cannot suspend a closed account!");
    }

    @Override
    public void activateState(Account account) {
        System.out.println("You cannot activate a closed account!");
    }

    @Override
    public void closeState(Account account) {
        System.out.println("Account is already closed!");
    }
}
