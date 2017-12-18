package javalearn;

public class NumberCalc {

	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 30;
		int numB = 20;
		int result2 = addNumber(numA, numB);
		System.out.println(result2);

	}

	static void printName() {

		System.out.println("My name is Sreejith");
	}

	static int addNumber(int numberA, int numberB) {
		// This function will add two numbers
		int numA = 10;
		int numB = 20;
		int result, result2;

		System.out.println(result = numA + numB);
		result2 = numberA + numberB;
		printName();
		return result2;

	}
}
