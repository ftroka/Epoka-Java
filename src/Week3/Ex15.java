package Week3;
import java.util.Scanner;
public class Ex15 {
public static int sum(double[] array) {
	int sum = 0;
	for(int i = 0;i< array.length;i++) {
		sum += array[i];
	}
	return sum;
}
public static int average(double[] array) {
	return sum(array)/array.length;
}
public static int countAbove(double[] array,double avg) {
	int count = 0;
	for(int i = 0 ;i< array.length;i++) {
		if(array[i]>avg) {
			count++;
		}
	}
	return count;
}
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] numbers = new double[10];

    System.out.println("Enter nrs:");
    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = input.nextDouble();
    }

    double total = sum(numbers);
    double avg = average(numbers);
    int above = countAbove(numbers, avg);

    System.out.println("Sum: " + total);
    System.out.println("Avg: " + avg);
    System.out.println("Above avg: " + above);

    input.close();
}
}
