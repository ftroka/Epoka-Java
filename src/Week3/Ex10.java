package Week3;
import java.util.Scanner;
public class Ex10 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        int[] count = new int[51]; 

	        System.out.println("Enter the integers between 1 and 50:");

	        int number;

	        while ((number = input.nextInt()) != 0) {
	            if (number >= 1 && number <= 50) {
	                count[number]++;
	            }
	        }

	        for (int i = 1; i <= 50; i++) {
	            if (count[i] > 0) {
	                if (count[i] == 1) {
	                    System.out.println(i + " occurs 1 time");
	                } else {
	                    System.out.println(i + " occurs " + count[i] + " times");
	                }
	            }
	        }

	        input.close();
	    }
}
