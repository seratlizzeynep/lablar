package labson;

public class Library {
    private static int totalBooks = 0;
    private static int totalDVDs = 0;
    private static final int MAX_ITEMS = 3;
    
    private Book[] kitaplar = new Book[MAX_ITEMS];
    private DVD[] dvdler = new DVD[MAX_ITEMS];

    public void listItems() {
        

        for (int i = 0; i < totalBooks; i++) {
            System.out.println(kitaplar[i].getItemDetails());
        }
        
        for (int i = 0; i < totalDVDs; i++) {
            System.out.println(dvdler[i].getItemDetails());
        }
    }
    
    public void addItem(LibraryItem item) {
        if (item instanceof Book && totalBooks < MAX_ITEMS) {
            kitaplar[totalBooks] = (Book) item;
            totalBooks++;
        } else if (item instanceof DVD && totalDVDs < MAX_ITEMS) {
            dvdler[totalDVDs] = (DVD) item;
            totalDVDs++;
        }
    }

 
}
