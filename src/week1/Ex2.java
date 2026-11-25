package week1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		System.out.println("Enter an integer");
		boolean result;
		
		System.out.println("Is" + number+"divisible by 5 and 6?");
		if(number % 5 == 0 && number % 6 == 0) {
			result=true;
		}else {
			result=false;
		}
		System.out.println(result);
		
		
		System.out.println("Is"+ number+"divisible by 5 or 6?");
		if(number % 5 == 0 || number % 6 == 0) {
			result=true;
		}else {
			result = false;
		}
		System.out.println(result);
		
		System.out.println("Is"+ number+"divisible by 5 or 6,but not both?");
		if(number % 5 == 0 ^ number % 6 == 0) {
			result=true;
		}else {
			result=false;
		}
		sc.close();
		System.out.println(result);
	}
}
