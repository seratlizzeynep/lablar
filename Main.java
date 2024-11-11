package labson;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
    
        library.addItem(new Book("1984", "George Orwell", true));
        library.addItem(new Book("Of Mice and Men", "John Stainbeck", true));
        library.addItem(new Book("Hamlet", "William Shakespeare", true));
        
        
        library.addItem(new DVD("Inception", "Christopher Nolan", true));
        library.addItem(new DVD("Oppenheimer", "Christopher Nolan", true));
        
       
        library.listItems();
    }
}
