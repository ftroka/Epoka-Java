package Week5;

public class BankAcc {
	private String accountNr;
	private String ownerName;
	private double balance;
	private static String bankName= "abc bank";
	
	public BankAcc(String accountNr, String ownerName, double balance ) {
		this.accountNr=accountNr;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	public String getaccountNr() {
		return accountNr;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setAccountNr(String accountNr) {
		this.accountNr = accountNr;
	}
	 public void setBalance(double balance) {
		 if(balance >= 0) 
			 this.balance=balance;
		 else
			 System.out.println("Error!Balance cannot be negative.");
		 }
	 public void setOwnerName(String ownerName) {
		 if (ownerName != null && !ownerName.trim().isEmpty()) 
			 this.ownerName= ownerName;
		 else
			 System.out.println("Error!Owner cannot be empty");
			 
	 }
	 public void deposit(double amount) {

	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful: " + amount);
	        } else {
	            System.out.println("Error: Deposit amount must be positive!");
	        }
	    }
	 public void withdraw(double amount) {
		 if (amount <= 0) {
	            System.out.println("Error: Withdrawal amount must be positive!");
	        } 
	        else if (amount > balance) {
	            System.out.println("Error: Insufficient balance!");
	        } 
	        else {
	            balance -= amount;
	            System.out.println("Withdrawal successful: " + amount);
	        }
	    }
	 public void displayInfo() {
	        System.out.println("Bank: " + bankName);
	        System.out.println("Account Number: " + accountNr);
	        System.out.println("Owner: " + ownerName);
	        System.out.println("Balance: " + balance);
	    }
	 public static String getBankName() {
		 return bankName;
	 }
	 public static void setBankName(String name) {

	        if (name != null && !name.trim().isEmpty()) {
	            bankName = name;
	        } else {
	            System.out.println("Error: Bank name cannot be empty!");
	        }
	    }
}

