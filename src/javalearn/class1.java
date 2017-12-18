package javalearn;

import java.util.Scanner;

public class class1 {
	
	public static void main(String[] args){
		
		System.out.println("Hello World");
		int score;
		String class_var;
		int a=0;
		while(a<3)
		{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Score");
		score= scan.nextInt();
		if(score<35){
			class_var="Passed";
		} else if (score>35 && score<60){
			class_var="First Class";
		} else
			class_var="Distinction";
		switch(class_var)
		{
		case "Passed" :
			System.out.println("Passed with minimum marks");
			break;
		case "First Class" :
			System.out.println("Passed with First Class");
			break;
		case "Distinction" :
			System.out.println("Passed with high first class");
			break;
			
		
		}
		a++;
		}
		
	}
}


