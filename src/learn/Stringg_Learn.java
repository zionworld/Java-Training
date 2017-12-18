package learn;

public class Stringg_Learn {

	public static void main(String[] args) {
		String country = new String();
		String country_1 = new String();
		country = "India";
		System.out.println("The value of country : " + country);	
		country = country_1;
		Boolean pegeon = country.isEmpty();
		System.out.println(pegeon);
		System.out.println("The value of country after move : "+country);	
		
		System.out.println("The value of country_1 : "+country_1);
		
		String country_2= "America";
		String country_3 = country_2;
		System.out.println("The value of country_2 :" +country_2);
		System.out.println("The value of country_3 : "+country_3);
		
		Integer rank = new Integer(7);
		Integer newrank = rank;
		int a = 5;
		int b = 6;
		a=b;
		b=rank;
		System.out.println("The value of rank rank :" +rank);
		System.out.println("The value of new rank :" +newrank);
		System.out.println("The value of a :" + a);
		System.out.println("The value of b :" + b);
	}

}
