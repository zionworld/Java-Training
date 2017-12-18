package bankAccount;

import java.util.HashMap;
import java.util.Map;

import productCatalog.Product;

public class DBBank {

	public static Map<String, AccountDetails> accountdb= new HashMap<>();
	
	public static void insertSeedData(){
		
		AccountDetails custone = new AccountDetails();
		AccountDetails custtwo = new AccountDetails();
		AccountDetails custthree = new AccountDetails();
		AccountDetails custfour = new AccountDetails();
		AccountDetails custfive = new AccountDetails();
		
		custone.setAccount_number(10001211);
		custone.setCust_Name("Sandeep");
		custone.setAccount_balance(1300.00);
		accountdb.put(custone.getAccount_number().toString(), custone);
				
		custtwo.setAccount_number(10001212);
		custtwo.setCust_Name("Ajeesh");
		custtwo.setAccount_balance(1750.00);
		accountdb.put(custtwo.getAccount_number().toString(), custtwo);
		
		custthree.setAccount_number(10001213);
		custthree.setCust_Name("Dileep");
		custthree.setAccount_balance(1530.74);
		accountdb.put(custthree.getAccount_number().toString(), custthree);
		
		custfour.setAccount_number(10001214);
		custfour.setCust_Name("Shinu");
		custfour.setAccount_balance(2310.09);
		accountdb.put(custfour.getAccount_number().toString(), custfour);
		
		custfive.setAccount_number(10001215);
		custfive.setCust_Name("Sreerag");
		custfive.setAccount_balance(2463.00);
		accountdb.put(custfive.getAccount_number().toString(), custfive);
	}
}
