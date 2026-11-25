package Week3;
import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of students:");
	int number = sc.nextInt();
	String min1Name = "";
    String min2Name = "";
    double min1 = 9999;
    double min2 = 9999;
    
	for(int i=0; i < number; i++) {
		String name = sc.next();
        double score = sc.nextDouble();	
		if( score < min1) {
			min2 = min1;
			min2Name = min1Name;
			
			min1 = score;
			min1Name = name;
		}else if ( score < min2 && score !=min1) {
			min2 = score;
			min2Name=name;
		}
	}
	sc.close();
	System.out.println("Min:" + min1Name + min1);
	System.out.println("Min2:" + min2Name + min2);
	
	}
}