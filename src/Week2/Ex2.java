package Week2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println("Enter an email:");
		int atIndex = input.indexOf("@");
		 
		if(atIndex != -1 ) {
			String username = input.substring(0,atIndex);
			String domain = input.substring(atIndex + 1);
			
			System.out.println("Username:"+ username);
			System.out.println("Domain:" + domain);
		}else {
				System.out.println("Invalid .TRY AGAIN !!!");
			}
		sc.close();
		}
		

}
