package Week5;
import java.util.Scanner;
public class AtmMachine {
	public static void main(String[] args) {
		Account[] acc = new Account[10];
		for(int i=0;i<10;i++) {
			acc[i] = new Account(i,100);
			
		}
		Account.setAnnualInterestRate(4.5);
		
		Scanner sc = new Scanner(System.in);
	while(true) {	
		int id;
		
		while(true) {   
			id = sc.nextInt();
			if(id < 0 || id > 9) {
				System.out.println("Enter correct id because this id is invalid");
			}else {
					break;
			}
		System.out.println("Enter a choice");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("The balance is " + account[id].getBalance());
			break;
		case 2:
			double amount = sc.nextDouble();
			System.out.println("Withdraw:" + account[id].withdraw(amount));
			break;
			
		//continue
		}
	}
}
