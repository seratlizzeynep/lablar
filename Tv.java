package laberen;

public class Tv implements StoreItem {
    private String brand;
    private String model;
    private int screenSize;
    private boolean available;

    public Tv(String brand, String model, int screenSize, boolean available) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.available = available;
    }

    @Override
    public String getItemDetails() {
        return "TV: " + brand + " " + model + " " + screenSize + "’ - Available: " + available;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}