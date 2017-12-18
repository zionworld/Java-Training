package learn;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercises2_w3schools {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value to add the integers");
		int valInput = in.nextInt();
		System.out.println(sumIntegers(valInput));
		
		
		
		double d, radius, x1, y1, x2, y2;
		radius = 6371.01;
		x1 = Math.toRadians(25);
		y1 = Math.toRadians(35);
		x2 = Math.toRadians(35.5);
		y2 = Math.toRadians(25.5);
		d = radius * Math.acos((Math.sin(x1)*Math.sin(x2))+(Math.cos(x1)*Math.cos(x2))* Math.cos(y1 - y2));
		System.out.println("The distance between 2 points is " + d);
		
		
		Scanner in1 = new Scanner(System.in);
		String str = in1.nextLine();
		char revArray = 0;
		char[] strArray = str.toCharArray();
		
		int lenArray = str.toCharArray().length;
		for (int i = (lenArray-1);i<lenArray;i--){
			revArray = strArray[i];
			System.out.print(revArray);
		}
		
	}
	
	private static Integer sumIntegers(int valInput){
		
		
		int value = 0;
		
		while (valInput != 0) {
		    value += valInput % 10;
		    valInput /= 10;
		}
		
		return value;
	}
	
	public static void stringCounts(String passedString){
		
		
	}

}
