package week1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();
        int product = 1;
        if (number == 0) {
            product = 0;
        } else {
        	do {
                int digit = number % 10;
                product *= digit;         
                number /= 10;              
            } while (number != 0);
        }
        System.out.println("The product of the digits is: " + product);

        input.close();
    }
}
