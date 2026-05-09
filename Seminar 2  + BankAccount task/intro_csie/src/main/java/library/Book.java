package library;

public class Book {
    private String title;
    private String author;
    private boolean borrowed;

    public Book(String title, String author) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title is required");
        }

        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author is required");
        }

        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    public void markAsBorrowed() {
        borrowed = true;
    }

    public void markAsReturned() {
        borrowed = false;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}