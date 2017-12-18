package bankAccount;

public class BankAccountApp {

	public static void main(String[] args) {

		BankAccount acc1 = new BankAccount("565987346", 5000.00);
		acc1.setName("Sreejith");
		acc1.getName();
		acc1.makeDeposit(250);
		acc1.payBill(100);
		acc1.accrue();
		System.out.println(acc1.toString());

		BankAccount acc2 = new BankAccount("165757693", 3499.20);

		BankAccount acc3 = new BankAccount("466584726", 4386.19);
	}
}

class BankAccount implements IInterest{
	// Properties of Bank Account
	private static int ID = 1000; // Internal ID
	private String accountNumber; // ID + random 2 numbers + first 2 of SSN
	private static final String routingNumber = "0045400657";
	private String name;
	private String SSN;
	private double balance;

	// Constructor
	public BankAccount(String SSN, double initDeposit) {
		System.out.println("New Account Created");
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();
	}

	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = ID + "" + random + "" + SSN.substring(0, 2);
		System.out.println("Your account number is : " + accountNumber);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void payBill(double amount) {

		balance = balance - amount;
		System.out.println("Paying bill : " + amount);
		showBalance();
	}

	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making deposit : " + amount);
		showBalance();
	}

	public void showBalance() {
		System.out.println("Balance : " + balance);
	}
	
	@Override
	public void accrue(){
		balance = balance * (1 +rate/100);
		showBalance();
	}
	
	@Override
	public String toString(){
		return "[Name : "+ name + " ]\n [Account Number : " + accountNumber+ "]\n[Rounting Number : "+ routingNumber + "]\n"
				+ "[Balance : "+balance + "]";
				
	}
}
