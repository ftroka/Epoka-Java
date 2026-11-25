package week1;
import java.util.Scanner;
public class Ex4 {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter year (e.g., 2012): ");
	        int year = input.nextInt();

	        System.out.print("Enter month (1-12): ");
	        int month = input.nextInt();

	        System.out.print("Enter the day of the month (1-31): ");
	        int day = input.nextInt();
	        if (month == 1 || month == 2) {
	            month += 12;
	            year -= 1;
	        }
	        int q = day;
	        int m = month;
	        int k = year % 100;
	        int j = year / 100;
	        int h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
	        String dayOfWeek = "";
	        if (h == 0)
	            dayOfWeek = "Saturday";
	        else if (h == 1)
	            dayOfWeek = "Sunday";
	        else if (h == 2)
	            dayOfWeek = "Monday";
	        else if (h == 3)
	            dayOfWeek = "Tuesday";
	        else if (h == 4)
	            dayOfWeek = "Wednesday";
	        else if (h == 5)
	            dayOfWeek = "Thursday";
	        else if (h == 6)
	            dayOfWeek = "Friday";

	        System.out.println("Day of the week is " + dayOfWeek);
	        input.close();
	}
}

