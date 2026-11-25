package Week3;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String input = sc.next();
		for(int i = input.length()-1 ; i >= 0 ; i--) {
			System.out.println("Reversed" + input.charAt(i));
		}
		sc.close();
		
	}
}
