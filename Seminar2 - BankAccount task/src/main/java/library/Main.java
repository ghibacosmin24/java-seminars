package library;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert C. Martin");
        Member member = new Member("Razvan");

        BorrowingSystem borrowingSystem = new BorrowingSystem();

        borrowingSystem.borrowBook(book, member);
        borrowingSystem.returnBook(book, member);
    }
}