package library;

public class BorrowingSystem {

    public void borrowBook(Book book, Member member) {
        if (book.isBorrowed()) {
            System.out.println("Book is already borrowed.");
            return;
        }

        book.markAsBorrowed();

        System.out.println(member.getName() + " borrowed book: " + book.getTitle());
    }

    public void returnBook(Book book, Member member) {
        if (!book.isBorrowed()) {
            System.out.println("Book is not borrowed.");
            return;
        }

        book.markAsReturned();

        System.out.println(member.getName() + " returned book: " + book.getTitle());
    }
}