package Week2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter a number :");
		
		double number = sc.nextDouble();
		double rounded = Math.round(number * 100.0)/100.0;
		
		System.out.println("Math.round: " + rounded);
		System.out.printf("printf:" + number);
		
		sc.close();
	}

}
