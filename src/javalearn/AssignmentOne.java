package javalearn;

public class AssignmentOne {

	public static void main(String[] args) {
		
		//Return sum of n numbers
		System.out.println("Sum of numbers 1 to 5");
		System.out.print(" "+sum(1));
		System.out.print(","+sum(2));
		System.out.print(","+sum(3));
		System.out.print(","+sum(4));
		System.out.println(","+sum(5));
		System.out.println("-_____________________________________________________________-");
		

		// Factorials 1 to 5;
		System.out.println("Factorial of number 1 to 5");
		System.out.print(" "+fac(1));
		System.out.print(","+fac(2));
		System.out.print(","+fac(3));
		System.out.print(","+fac(4));
		System.out.println(","+fac(5));
		System.out.println("-_____________________________________________________________-");

	}

	public static int sum(int n) {
		
		if (n == 1) {
			return 1;
		}

		int result = (sum(n - 1) + n);
		return result;
	}

	public static int fac(int n) {
		if (n == 1) {
			return 1;
		}

		int result = (fac(n - 1) * n);
		return result;

	}
	
	

}
