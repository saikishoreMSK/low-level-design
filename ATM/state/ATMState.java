package state;

import model.Card;

public interface ATMState {
    void insertCard(Card card);
    void enterPin(String pin);
    void checkBalance();
    void deposit(double amount);
    void withdraw(double amount);
    void ejectCard();
}
