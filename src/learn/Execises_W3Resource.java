package learn;

import java.util.Scanner;

public class Execises_W3Resource {

	public static void main(String[] args) {
		
		//boolean result = true;
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter the first value");
		long a = sc.nextLong();
        System.out.println("The sum of the digits is: " + sumDigits(a));
        
        /*System.out.println("Enter side length of hexagon");
        double hex = sc.nextDouble();
        System.out.println("The area of hexagon is "+ hexarea(hex));
*/
		System.out.println("Enter the statement to reverse");
		Scanner sc1 = new Scanner(System.in);
		char[] letter = sc1.nextLine().toCharArray();
		System.out.println("Reverse statement : ");
		
		for(int i = letter.length - 1; i>=0; i--){
			System.out.print(letter[i]);
		}
		System.out.println("\n");
	}
	
	public static int sumDigits(long a){
		int sum = 0;
		while(a != 0){
			sum += a%10;
			a /= 10;
		}
		return sum;
	
	}
	
	/*public static double hexarea(double hex){
		return (6 * hex * hex)/(4*Math.tan(Math.PI/6));
		
	}*/
	
}


