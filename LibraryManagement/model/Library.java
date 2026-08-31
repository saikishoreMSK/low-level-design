package model;
import java.util.*;

public class Library{
    List<Member> members;
    List<BookCopy> bookCopies;
    
    public Library(){
        this.members = new ArrayList<>();
        this.bookCopies = new ArrayList<>();
    }

    public void addMember(Member member){
        members.add(member);
        System.out.println("Member added successfully");
    }
    public void addBookCopy(BookCopy bookCopy){
        bookCopies.add(bookCopy);
        System.out.println("BookCopy added successfully");
    }
    public void showAvailableBookCopies(){
        for(BookCopy bookCopy : bookCopies){
            if(bookCopy.isAvailable()){
                System.out.println(bookCopy.getBook().getTitle()+", ");
            }
        }
    }
    public void borrowBook(Member member,BookCopy bookCopy){
        if(!bookCopy.isAvailable()){
            System.out.println("This book isn't available!");
            return;
        }
        bookCopy.setAvailable(false);
        Loan loan = new Loan(member, bookCopy);
        member.addLoan(loan);
        System.out.println(member.getName()+" has borrowed "+bookCopy.getBook().getTitle());
    }
    public void returnBook(BookCopy bookCopy){
        if(bookCopy == null) System.out.println("Book isn't exist");
        bookCopy.setAvailable(true);
        System.out.println(bookCopy.getBook().getTitle() + " has returned successfully");
    }
}