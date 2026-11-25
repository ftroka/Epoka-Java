package Week2;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter years: ");
        int years = sc.nextInt();

        double amount = principal *
                Math.pow(1 + rate / 100, years);
        sc.close();
        System.out.printf("Final amount: %.2f%n", amount);
    }
}
