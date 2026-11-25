package Week2;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = sc.nextLine();
		
		System.out.println("Length:"+ input.length());
		System.out.println("Uppercase:" + input.toUpperCase());
		System.out.println("Lowercase:"+ input.toLowerCase());
		System.out.println("First:"+ input.charAt(0));
		System.out.println("Last:"+ input.charAt(input.length()-1));
		sc.close();
	}
}
