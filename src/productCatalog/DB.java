package productCatalog;


import java.util.HashMap;
import java.util.Map;


public class DB {
	
	public static Map<String, Product> products= new HashMap<>();
	public static void insertSeedData(){
		
		System.out.println("DB.insertSeedData()");
		
		//Creating Product objects
		Product product121 = new Product();
		Product product122 = new Product();
		Product product123 = new Product();
		Category categoryType1 = new Category();
		Category categoryType2 = new Category();
		
		categoryType1.setName("Cars");
		categoryType2.setName("Super Cars");
		
		
		//Product p1
		product121.setID(121);
		product121.setName("BMW");		
		product121.setCategory(categoryType1);
		products.put(product121.getID().toString(), product121);
				
		//Product p2
		product122.setID(122);
		product122.setName("Mercedes");
		product122.setCategory(categoryType1);
		products.put(product122.getID().toString(), product122);
		
		
		//Product p3
		product123.setID(123);
		product123.setName("Porche");
		product123.setCategory(categoryType2);
		products.put(product123.getID().toString(), product123);
		
	}
}
