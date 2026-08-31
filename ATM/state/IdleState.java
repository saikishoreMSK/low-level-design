package state;
import model.*;
public class IdleState implements ATMState{
    private ATM atm;
    public IdleState(ATM atm){
        this.atm =atm;
    }
    @Override
    public void insertCard(Card card) {
        atm.setCard(card);
        atm.setState(new CardInsertedState(atm));
        System.out.println("Card inserted");
    }
    @Override
    public void enterPin(String pin) {
        System.out.println("Please insert card first");
    }
    @Override
    public void checkBalance() {
        System.out.println("Please insert card first");
    }
    @Override
    public void deposit(double amount) {
        System.out.println("Please insert card first");    
    }
    @Override
    public void withdraw(double amount) {
        System.out.println("Please insert card first");  
    }
    @Override
    public void ejectCard() {
        System.out.println("Please insert card first");
    }

    
}
