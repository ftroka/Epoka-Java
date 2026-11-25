package Week3;
import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int odd=0;
	int even=0;
	System.out.println("Enter numbers:");
	int number = sc.nextInt();
	while(number != 0) {
		
		if(number % 2 == 0 ) {
			even++;
		}else if(number % 2 != 0) {
			odd++;
		}
		number = sc.nextInt();
	}
	System.out.println("Odd:"+odd);
	System.out.println("Even:"+even);
	sc.close();
	}
}
