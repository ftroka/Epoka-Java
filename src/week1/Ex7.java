package week1;

import java.util.Scanner;

public class Ex7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter numbers (end with 0):");

        int number = input.nextInt();

        if (number == 0) {
            System.out.println("No numbers are entered except 0.");
        }

        int max = number;   
        int count = 1;     

        while (true) {
            number = input.nextInt();

            if (number == 0) 
            	break;

            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++; 
            }
        }

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);

        input.close();
    }
}
