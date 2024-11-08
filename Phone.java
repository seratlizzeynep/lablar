package laberen;

public class Phone implements StoreItem {
    private String brand;
    private String model;
    private int storage; // storage in GB
    private boolean available;

    public Phone(String brand, String model, int storage, boolean available) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.available = available;
    }

    @Override
    public String getItemDetails() {
        String storageString = (storage >= 1000) ? (storage / 1000) + " TB" : storage + " GB";
        return "Phone: " + brand + " " + model + " " + storageString + " - Available: " + available;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}