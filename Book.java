package lab012;


public class Book {

private int releaseDate;
private String name;
private double price;


public Book(int relDate, String nm, double prc) {
    this.releaseDate = relDate;
    this.name = nm;
    this.price = prc;
}

public int getReleaseDate() {
    return releaseDate;
}

public void setReleaseDate(int releaseDate) {
    this.releaseDate = releaseDate;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}


public void subtract(double amount) {
    this.price = this.price - amount;
}


public String toString() {
    return "Name: " + this.name + " Release Date: " + this.releaseDate + " Price: " + this.price;
}


public double deductPrice() {
    this.price = this.price -  50;
    return this.price;
}


public void changeName(String newName) {
    this.name = newName;


}
}