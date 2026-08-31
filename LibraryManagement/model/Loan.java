package model;

public class Loan {
    private Member member;
    private BookCopy bookCopy;

    public Loan(Member member, BookCopy bookCopy) {
        this.member = member;
        this.bookCopy = bookCopy;
    }
    
    public Member getMember() {
        return member;
    }
    public BookCopy getBookCopy() {
        return bookCopy;
    }

}
