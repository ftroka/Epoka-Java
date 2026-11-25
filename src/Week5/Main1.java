package Week5;

public class Main1 {
	//This is connected to ex 1 BankACC
	public static void main(String[] args) {
		BankAcc acc1 = new BankAcc("1001", "John", 1000);
        BankAcc acc2 = new BankAcc("1002", "Anna", 2000);
        BankAcc acc3 = new BankAcc("1003", "Mark", 1500);
        BankAcc acc4 = new BankAcc("1004", "Sara", 500);
        
        System.out.println("Bank name: " + BankAcc.getBankName());
        System.out.println("\nINITIAL ACCOUNTS:");
        acc1.displayInfo();
        acc2.displayInfo();
        acc3.displayInfo();
        acc4.displayInfo();
        
        System.out.println("\nTEST DEPOSIT:");
        acc1.deposit(500);
        acc1.deposit(-100);
        
        System.out.println("\nTEST WITHDRAW:");

        acc2.withdraw(500);
        acc2.withdraw(5000);
        
        System.out.println("\nTEST VALIDATION:");

        acc3.setBalance(-500);
        acc4.setOwnerName("");
        
        System.out.println("\nCHANGE BANK NAME:");

        BankAcc.setBankName("New National Bank");
	
	//displaying all acc
        acc1.displayInfo();
        acc2.displayInfo();
        acc3.displayInfo();
        acc4.displayInfo();
	}

}
