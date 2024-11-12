package ınheritance;
public class Main {
    public static void main(String[] args) {
        Pool pool1 = new Pool(12, 3, 4);
        Pool pool2 = new Pool(2, 3, 4);
        SwimmingPool swimPool1 = new SwimmingPool(1, 3, 5, true);
        OrnamentalPool ornPool1 = new OrnamentalPool(0, 2, 4, true);
        OrnamentalPool ornPool2 = new OrnamentalPool(1, 3, 5, true);
        SwimmingPool swimPool2 = new SwimmingPool(1, 3, 5, false);

        System.out.println(pool1.equals(pool2)); // false
        System.out.println(ornPool1.equals(ornPool2)); // true
        System.out.println(ornPool1.equals(swimPool1)); // false
        System.out.println(swimPool1.equals(swimPool2)); // true
        System.out.println(swimPool1.equals(pool1)); // false
    }
}
