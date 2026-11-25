package week1;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter package weight: ");
        double weight = sc.nextDouble();

        double cost = 0;

        if (weight > 0 && weight <= 2) {
            cost = 2.5;

        } else if (weight > 2 && weight <= 4) {
            cost = 4.5;

        } else if (weight > 4 && weight <= 10) {
            cost = 7.5;

        } else if (weight > 10 && weight <= 20) {
            cost = 10.5;

        } else {
            System.out.println("The package cannot be shipped");
            sc.close();
            return;
        }
        System.out.println("The shipping cost is: $" + cost);
        sc.close();
    }
}