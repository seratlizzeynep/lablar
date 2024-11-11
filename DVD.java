package labson;

public class DVD implements LibraryItem {
    private String title;
    private String director;
    private boolean available;

    public DVD(String title, String director, boolean available) {
        this.title = title;
        this.director = director;
        this.available = available;
    }

    @Override
    public String getItemDetails() {
        return "DVD: " + title + " directed by " + director + " - Available: " + available;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}
