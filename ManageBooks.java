package lab012;

public class ManageBooks {
    public static void main(String[] args) {
    
        Book b1 = new Book(2020, "History of Science", 2000);

        Book b2 = new Book(2010, "Calculus", 500);

        
        b1.subtract(100);

        
        System.out.println("Book 1's price: " + b1.getPrice());

       
        b2.subtract(50);

      
        System.out.println("Book 2's price: " + b2.getPrice());

        
        b1.deductPrice();
        b2.deductPrice();

        
        b1.changeName("Java Programming");

    
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}

