package Week4;
//THIS MAIN IS CONNECTED TO EX 2 (student)
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		String name;
    	int[] arr = new int[5];
    	Scanner sc = new Scanner(System.in);
    	for(int i = 0;i < 5;i++) {
    		arr[i] = sc.nextInt();
    	}
    	name = sc.next();
    	Student s1 = new Student(name,arr);
    	s1.printStInfo();
    	}
}
