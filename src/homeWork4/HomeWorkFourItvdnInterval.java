package homeWork4;

import java.util.Scanner;

public class HomeWorkFourItvdnInterval {
    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner scannerNumber = new Scanner(System.in);
        int number = scannerNumber.nextInt();

         if (number < 0 || number > 100) {
            System.out.println("Wrong number");

         } else if (number >= 0 && number <= 14) {
            System.out.println("Numeric span |0 - 14|");

         } else if (number >= 15 && number <= 35) {
             System.out.println("Numeric span |15 - 35");

         } else if (number >= 36 && number <= 50) {
             System.out.println("Numeric span |36 - 50|");

         } else if (number >= 50 && number <= 100) {
             System.out.println("Numeric span |50 - 100|");
         }

    }
}
