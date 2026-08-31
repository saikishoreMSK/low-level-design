import model.ATM;
import model.Account;
import model.Card;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("a1", 10000);
        Card card = new Card("c1", "1234", account);

        ATM atm = new ATM();
        atm.insertCard(card);
        atm.checkBalance();
        atm.enterPin("1234");
        atm.checkBalance();
        atm.deposit(10);
        atm.checkBalance();
        atm.withdraw(2000);
        atm.ejectCard();
    }
}
