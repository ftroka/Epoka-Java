package Week3;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN: ");
        String isbn = sc.nextLine();

        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = isbn.charAt(i) - '0'; 
            sum += digit * (i + 1);
        }

        int checksum = sum % 11;

        String fullISBN;
        if (checksum == 10) {
            fullISBN = isbn + "X";
        } else {
            fullISBN = isbn + checksum;
        }

        System.out.println("The complete ISBN-10 is: " + fullISBN);

        sc.close();
    }
}
