package laberen;
public class ElectronicStore {
    private static int totalPhones = 0;
    private static int totalTVs = 0;
    private Phone[] phones;
    private Tv[] tvs;
    private int phoneIndex = 0;
    private int tvIndex = 0;

    public ElectronicStore(int phoneCapacity, int tvCapacity) {
        phones = new Phone[phoneCapacity];
        tvs = new Tv[tvCapacity];
    }

    public void addItem(StoreItem item) {
        if (item instanceof Phone) {
            phones[phoneIndex++] = (Phone) item;
            totalPhones++;
        } else if (item instanceof Tv) {
            tvs[tvIndex++] = (Tv) item;
            totalTVs++;
        }
    }

    public void listItems() {
        
        for (int i = 0; i < phoneIndex; i++) {
            System.out.println(phones[i].getItemDetails());
        }
       
        for (int i = 0; i < tvIndex; i++) {
            System.out.println(tvs[i].getItemDetails());
        }
    }
}