package state;

import model.ATM;
import model.Card;

/**
 * CardInsertedState
 */
public class CardInsertedState implements ATMState{
    private ATM atm;
    public CardInsertedState(ATM atm){
        this.atm =atm;
    }
    @Override
    public void insertCard(Card card) {
        System.out.println("Card already inserted");
    }
    @Override
    public void enterPin(String pin) {
        Card card = atm.getCurrentCard();
        if(card.validatePin(pin)){
            atm.setState(new AuthenticatedState(atm));
        }
        System.out.println("PIN varified");
    }
    @Override
    public void checkBalance() {
        System.out.println("Validate PIN first");
    }
    @Override
    public void deposit(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }
    @Override
    public void withdraw(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }
    @Override
    public void ejectCard() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ejectCard'");
    }

    
}
