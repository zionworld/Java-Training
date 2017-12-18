package learn;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		String number = n.nextLine();
		int printNumber = Integer.parseInt(number);
		System.out.println(printNumber);
		
		Scanner n2 = new Scanner(System.in);
		System.out.println("Enter the first integer :");
		Integer firstVal = n2.nextInt();
		Scanner n3 = new Scanner(System.in);
		System.out.println("Enter the second integer :");
		Integer secondVal = n3.nextInt();
		Scanner n4 = new Scanner(System.in);
		System.out.println("Enter the third integer :");
		Integer thirdVal = n4.nextInt();
		
		Integer sum = (firstVal + secondVal);
		if(sum == thirdVal){
			System.out.println("The third integer is equal to the sum of first and second");
		}else{
			System.out.println("The third value is not equal to the sum of first and second");
		}
	}
}