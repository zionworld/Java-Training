package bankAccount;

public class Teller {

	public static void main(String[] args) {
		
		DBBank.insertSeedData();		
		
		System.out.println("Enter your choice");
		System.out.println("1. Get Account Balance");
		System.out.println("2. Deposit Cash");
		System.out.println("3. Withdraw Cash");
		System.out.println("4. Logout from the System");
	}

}
