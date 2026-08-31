package model;
public class Card {
    private String cardId;
    private String pin;
    private Account account;

    public Card(String cardId, String pin, Account account){
        this.cardId =cardId;
        this.pin = pin;
        this.account = account;
    }
    public boolean validatePin(String pin){
        return this.pin.equals(pin);
    }
    
    public String getCardId() {
        return cardId;
    }
    public Account getAccount() {
        return account;
    }
}
