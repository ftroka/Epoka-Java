package week1;
import java.util.Scanner;
public class Ex5 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the exchange rate from dollars to RMB: ");
	        double rate = input.nextDouble();

	        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
	        int choice = input.nextInt();

	        if (choice == 0) {
	            System.out.print("Enter the dollar amount: ");
	            double dollars = input.nextDouble();
	            double rmb = dollars * rate;
	            System.out.printf("$%.1f is %.1f yuan%n", dollars, rmb);
	        } else if (choice == 1) {
	            System.out.print("Enter the RMB amount: ");
	            double rmb = input.nextDouble();
	            double dollars = rmb / rate;
	            System.out.printf("%.1f yuan is $%.2f%n", rmb, dollars);
	        } else {
	         
	            System.out.println("Incorrect input");
	        }

	        input.close();
	    }
	}
