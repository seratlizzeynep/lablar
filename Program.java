package lab022;

import java.util.Scanner;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        String[] dizi = new String[6];
        dizi[0] = "PROG4";
        dizi[1] = "PROG5";
        int diziBoyut = 2; 

        while (true) {
            System.out.println("Please enter a program name:");
            String deger;
            deger= scanner.nextLine().toUpperCase(); 

            if (deger.equalsIgnoreCase("stop")) {
                break; 
            }
            
            if (diziBoyut < dizi.length) {
                dizi[diziBoyut] = deger; 
                diziBoyut++; 
                
                
                Arrays.sort(dizi, 0, diziBoyut); 
            }
         
            for (int i = 0; i < diziBoyut; i++) {
                System.out.print(dizi[i] + "  ");
            }
           
            
            System.out.println();
        }

     
    }
}
