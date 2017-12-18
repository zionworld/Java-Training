package productCatalog;


public class ProductDAO {	
	public Product getProduct(Product ID, Product name ) {		
		DB.products.get(ID);
		return DB.products.getOrDefault(ID, name);
	}

	public Boolean  deleteProduct(Product ID) {
		DB.products.remove(ID);
		return true;
	}
/*
	public Boolean updateProduct(String ID, Product name) {
		DB.products.
		return true;
	}*/

	/*public Product createProduct(Product ID, Product name); {
		DB.products.put(ID, name);
	}*/
}
