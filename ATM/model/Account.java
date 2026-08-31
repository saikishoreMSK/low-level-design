package model;
public class Account{
    private String accountId;
    private double balance;

    public Account(String accountId,double balance){
        this.accountId = accountId;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount){
        if(amount<=0 || amount> balance){
            return false;
        }
        balance -= amount;
        return true;
    }
    public boolean deposit(double amount){
        if(amount<=0){
            return false;
        }
        balance += amount;
        return true;
    }

}