package laberen;

public class Main {
    public static void main(String[] args) {
        ElectronicStore store = new ElectronicStore(10, 10);
        store.addItem(new Phone("iPhone", "15 Pro ", 1024, true));
        store.addItem(new Phone("Samsung Galaxy", "S24+", 256, true));
        store.addItem(new Tv("Samsung", "65Q70C", 65, true));
        store.addItem(new Tv("Philips", "77OLED808", 77, true));
        
        store.listItems();
    }
}