package model;

import java.util.ArrayList;
import java.util.List;

public class Member{
    private String name;
    public String getName() {
        return name;
    }
    private List<Loan> loans;

    public Member(String name) {
        this.name = name;
        this.loans = new ArrayList<>();
    }

    public void displayBooks(){
        System.out.println(name+" has : ");
        for(Loan loan : loans){
            System.out.println(loan.getBookCopy().getBook().getTitle()+", ");
        }
    }
    public void addLoan(Loan loan){
        this.loans.add(loan);
        System.out.println("Loan added succesfully");
    }
}