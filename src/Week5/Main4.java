package Week5;
//This main is related to account.java ex 4
public class Main4 {
	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		Account.setAnnualInterestRate(4.5);
		account.withdraw(2500);
        account.deposit(3000);
 
        System.out.println("Account ID: " + account.getId());
        System.out.println("Balance: "+ account.getBalance());
        System.out.println("Monthly interest: "+account.getMonthlyInterest());
        System.out.println("Date created: " + account.getDateCreated());
	}
}
