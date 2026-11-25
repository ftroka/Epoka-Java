package Week3;
import java.util.Scanner;
public class Ex14 {
	    public static int average(int[] array) {
	        int sum = 0;
	        for (int i = 0; i < array.length; i++) {
	            sum += array[i];
	        }
	        return sum / array.length;
	    }
	    public static double average(double[] array) {
	        double sum = 0;
	        for (int i = 0; i < array.length; i++) {
	            sum += array[i];
	        }
	        return sum / array.length;
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter n (how many numbers): ");
	        int n = input.nextInt();
	        int[] intArray = new int[n];
	        System.out.print("Enter " + n + " integers: ");
	        for (int i = 0; i < n; i++) {
	            intArray[i] = input.nextInt();
	        }

	        double[] doubleArray = new double[n];
	        System.out.print("Enter " + n + " doubles: ");
	        for (int i = 0; i < n; i++) {
	            doubleArray[i] = input.nextDouble();
	        }

	        System.out.println("Average of int array: " + average(intArray));
	        System.out.println("Average of double array: " + average(doubleArray));

	        input.close();
	    }
}
