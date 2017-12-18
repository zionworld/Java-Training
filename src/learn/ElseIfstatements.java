package learn;

public class ElseIfstatements {
	
	public static void main(String[] args){
		
	int num = (int)(Math.random()*20);
	System.out.println("The number is "+ num);
	
	if(num<10)
		System.out.println("The "+ num + " is less than 10");
	else if(num>11 && num<=15)
		System.out.println("The " + num + " is greater than 10 and less than 15");
	else
		System.out.println("The "+ num + " is greater than 15");
	
	
}

}