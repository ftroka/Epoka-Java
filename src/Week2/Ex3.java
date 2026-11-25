package Week2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter seconds:");
		int totalSeconds = sc.nextInt();
		
		int hours = totalSeconds/3600;
		
		int minutes = (totalSeconds % 3600 ) / 60;  //calc remaining minutes
		
		int seconds = totalSeconds % 60 ;  //calc remaining seconds
		  sc.close();
		System.out.println(
				hours + (hours == 1 ? "hour" : "hours") +
				minutes + (minutes == 1 ? "minute" : "minutes") +
				seconds + (seconds == 1 ? "second" : "seconds")
				);
		
	}

}
