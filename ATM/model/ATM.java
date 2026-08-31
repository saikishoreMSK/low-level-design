package model;

import state.ATMState;
import state.IdleState;

public class ATM {
    private ATMState currentState;
    private Card currentCard;
    public ATM(){
        currentState = new IdleState(this);
    }
    public void setState(ATMState state){
        this.currentState = state;
    }
    public void setCard(Card currCard){
        this.currentCard = currCard;
    }
    public ATMState getCurrentState() {
        return currentState;
    }
    public Card getCurrentCard() {
        return currentCard;
    }
    public void insertCard(Card card){
        currentState.insertCard(card);
    }
    public void enterPin(String pin){
        currentState.enterPin(pin);
    }
    public void checkBalance(){
        currentState.checkBalance();
    }
    public void withdraw(double amount){
        currentState.withdraw(amount);
    }
    public void deposit(double amount){
        currentState.deposit(amount);
    }
    public void ejectCard(){
        currentState.ejectCard();
    }
}
