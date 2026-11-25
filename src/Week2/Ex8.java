
package Week2;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sides: ");
        int n = sc.nextInt();

        System.out.print("Enter side length: ");
        double s = sc.nextDouble();

        double area = (n * Math.pow(s, 2)) /(4 * Math.tan(Math.PI / n));
        sc.close();
        System.out.printf("Area: %.2f%n", area);
    }
}
