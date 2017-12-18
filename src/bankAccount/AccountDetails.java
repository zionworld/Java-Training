package bankAccount;

public class AccountDetails {

	private Integer Account_number;
	private String Cust_Name;	
	private double Account_balance;
	
	
	Integer getAccount_number() {
		return Account_number;
	}
	public void setAccount_number(Integer account_number) {
		this.Account_number = account_number;
	}
	public String getCust_Name() {
		return Cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		this.Cust_Name = cust_Name;
	}	
	public double getAccount_balance() {
		return Account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.Account_balance = account_balance;
	}
	
}
