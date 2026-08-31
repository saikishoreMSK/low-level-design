import model.*;

public class Main{
    public static void main(String[] args) {
        Library library = new Library();
        //create books
        Book book1 = new Book("The Alchemist", "Alchem");
        Book book2 = new Book("Rich Dad","Robert");
        //create book copies
        BookCopy copy01 = new BookCopy("001", book1);
        BookCopy copy02 = new BookCopy("002", book1);
        BookCopy copy03 = new BookCopy("003", book2);
        BookCopy copy04 = new BookCopy("004", book2);

        //add these book copies in library
        library.addBookCopy(copy01);
        library.addBookCopy(copy02);
        library.addBookCopy(copy03);
        library.addBookCopy(copy04);
        //create members;
        Member member1 = new Member("Sai");
        Member member2 = new Member("Kishore");
        //add members to library
        library.addMember(member2);
        library.addMember(member1);

        System.out.println("Available Book Copies:- ");
        library.showAvailableBookCopies();
        library.borrowBook(member1, copy01);
        library.borrowBook(member2, copy02);

        System.out.println("Available Book Copies:- ");  
        library.showAvailableBookCopies();

        library.returnBook(copy02);
    }
}