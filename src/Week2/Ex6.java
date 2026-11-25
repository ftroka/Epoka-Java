package Week2;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		double number = sc.nextDouble();
		
		 System.out.println("Floor:" + Math.floor(number));
		 System.out.println("Ceil:" + Math.ceil(number));
		 System.out.println("Round:" + Math.round(number));
		 System.out.println("Rint:" + Math.rint(number));
		 

		 sc.close();
	}

}
