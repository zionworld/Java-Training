package productCatalog;

import java.io.InputStream;
import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) {
		DB.insertSeedData();
		boolean flag = true;

		// TODO 3 : Start of loop
		while (flag) {

			System.out.println("1 get Product");
			System.out.println("2 Update Product");
			System.out.println("3 create Product");
			System.out.println("4 Delete Product");
			System.out.println("5 Exit");

			System.out.println("Enter you choice of operation");
			Integer nextLine = readFromConsole();
			System.out.println(nextLine);

			// Get product function
			switch (nextLine) {
			case 1:
				System.out.println("Enter product ID");
				String prodID = readFromConsole().toString();
				if (DB.products.containsKey(prodID)) {
					System.out.println("The database contains the product");
					System.out.println("The product detail is " + DB.products.get(prodID).getName());
				} else {
					System.out.println(false);
				}
				break;

			// Product Update function
			/*
			 * case nextLine=2 : System.out.println("Enter new product ID");
			 * String newprodID = readFromConsole().toString(); Product
			 * product+newprodID = new Product();
			 */

			/*
			 * //Product create function case 3:
			 * System.out.println("Enter new product ID"); String newprodID =
			 * readFromConsole().toString(); System.out.println("Enter ");
			 * DB.products.putIfAbsent(newprodID, value)
			 */

			// Product Delete function
			case 4:
				System.out.println("Enter new product ID");
				String newprodID = readFromConsole().toString();
				if (DB.products.containsKey(newprodID)) {
					DB.products.remove(newprodID);
					System.out.println("The product is removed from the database");
				} else {
					System.out.println("Product not found!!!!");
				}

			case 5:
				System.out.println("The user chooses to exit");
				flag=false;
				break;
			}
		}

	}

	private static Integer readFromConsole() {
		Scanner scanner = new Scanner(System.in);
		Integer nextLine = scanner.nextInt();
		return nextLine;
	}
}
