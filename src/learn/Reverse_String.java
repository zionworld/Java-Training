package learn;

import java.util.Scanner;

public class Reverse_String {
	
	

	public static void main(String[] args) {
		
		String orgState;
		String orgChar;
		String revState = "";
		char revChar;
		//Scanner entWord = new Scanner(System.in);
		//System.out.println("Enter the statement to be reversed");
		//orgState = entWord.nextLine();
		//System.out.println(orgState);
		orgState ="This is the string test";
		String[] wrdSplit = orgState.split("\\s+");				
		for(String item : wrdSplit){
			revState = item + revState;			
		}	 
		System.out.print(revState);
		
		
		System.out.println("***************************************************");
		
		orgChar = "how are you";
		char[] wrdArray = orgChar.toCharArray();		
		for(int i=(wrdArray.length-1);i<wrdArray.length;i--){
		  revChar = wrdArray[i];
		  System.out.print(revChar);
		  
		}	
		
	}

}
