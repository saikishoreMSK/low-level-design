package state;

import model.*;

/**
 * AuthenticatedState
 */
public class AuthenticatedState implements ATMState{
    private ATM atm;
    public AuthenticatedState(ATM atm){
        this.atm = atm;
    }
    @Override
    public void insertCard(Card card) {
        System.out.println("Card inserted and validated");
    }
    @Override
    public void enterPin(String pin) {
        System.out.println("Card inserted and validated");
    }
    @Override
    public void checkBalance() {
        Account account = atm.getCurrentCard().getAccount();
        System.out.println("Balance: "+account.getBalance());
    }
    @Override
    public void deposit(double amount) {
        Account account = atm.getCurrentCard().getAccount();
        account.deposit(amount);
        System.out.println("deposited");
    }
    @Override
    public void withdraw(double amount) {
        Account account = atm.getCurrentCard().getAccount();
        account.withdraw(amount);
        System.out.println("successfully withdrawed");
    }
    @Override
    public void ejectCard() {
        atm.setCard(null);
        atm.setState(new IdleState(atm));
        System.out.println("Card Ejected");
    }
    
}
