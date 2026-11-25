package Week3;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Read how many numbers
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        // Step 2: Read numbers into array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Step 3: Print them in reverse order
        System.out.println("Numbers in reverse order:");
        for (int i = n-1; i>=0; i--) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}
