package javalearn;

public class Measurement {

	public static void main(String[] args){
		
		Volformula volume = new Volformula();
		int answer = volume.rectangle(15, 12, 4);
		System.out.println(answer);
		
		Volformula volume1 = new Volformula();
		System.out.println(volume1.circle());
		
		System.out.println(add(2,3));
		System.out.println(add(2.3,5.6));
		System.out.println(add("Sreejith","Satish"));
		
		
		
	}
	//method overloading example
	public static int add(int a, int b){
		return (a +b);
		
	}
	//method overloading example
	public static double add(double a, double b){
		return (a + b);
		
	}
	//method overloading example
	public static String add(String a, String b){
		return (a + b);
	}
	
	
}
