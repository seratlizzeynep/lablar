package labson;

public class Book implements LibraryItem {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    @Override
    public String getItemDetails() {
        return "Book: " + title + " by " + author + " - Available: " + available;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}

