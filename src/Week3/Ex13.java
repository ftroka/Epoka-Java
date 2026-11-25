package Week3;
import java.util.Scanner;

public class Ex13 {
	    public static double max(double[] array) {
	        double max = array[0];

	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }

	        return max;
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        double[] numbers = new double[10];

	        System.out.println("Enter numbers:");

	        for (int i = 0; i < 10; i++) {
	            numbers[i] = input.nextDouble();
	        }

	        System.out.println("Max is: " + max(numbers));

	        input.close();
	    }
	}
