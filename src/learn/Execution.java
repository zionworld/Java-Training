package learn;

public class Execution {

	public static void main(String[] args) {
		
		CalcMethods result = new CalcMethods();
		int answer1 = result.sum(5, 11);
		System.out.println("The sum of the numbers are " + answer1);
		
		int answer2 = result.subs(5, 8);
		System.err.println("The substract of the numbers are " + answer2);
		
		int answer3 = result.multi(6, 5);
		System.err.println("The multiply of the numbers are "+ answer3);
		
		int answer4 = result.divide(30, 6);
		System.err.println("The division of the numbers are "+ answer4);
		
		
		
		
	}

}
