package week1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int total = 0;
        int pos = 0;
        int neg = 0;
        float average;
        System.out.println("Enter integers (0 to stop):");
        num = sc.nextInt();
        while (num != 0) {
            if (num > 0) {
                pos++;
            } else {
                neg++;
            }
            total += num;
            num = sc.nextInt();
        }
        if (pos + neg > 0) {
            average = (float) total / (pos + neg);
            System.out.println("The number of positives is " + pos);
            System.out.println("The number of negatives is " + neg);
            System.out.println("The total is " + total);
            System.out.println("The average is " + average);
        } else {
            System.out.println("No non-zero numbers were entered.");
        }

        sc.close();
    }
}
