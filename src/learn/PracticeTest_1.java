package learn;

import java.util.Scanner;

public class PracticeTest_1 {
	public static void main(String[] args) {
		Scanner scanWord = new Scanner(System.in);
		System.out.println("Enter to check the word");
		String wordScanned = scanWord.nextLine();
		char[] word = wordScanned.toCharArray();		
		boolean validWord = validateWord(word);
		System.out.println(validWord);
		
		
		System.out.println("------------------------------------------------");
		

		double decimalArray[] = createDecimalArray();
		for(int i =0; i<decimalArray.length; i++){
			System.out.println(decimalArray[i]);
		}
		
		
		System.out.println("-------------------------------------------------");
		
		
		
		int studentRecord[][]={
				{1,78},
				{2,77},
				{3,44},
				{4,94}
			
		};
		boolean readStudentRecord = readStudentRecord(studentRecord);
		System.out.println("----------------------------------");
	}
	
	
	

	private static boolean validateWord(char[] word) {
		boolean result = false;
		int n = word.length;		
		if (word[0] == 'k' && word[n-1]=='e') {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	
	
	
	private static double[] createDecimalArray() {
		double decimalArray[]= new double[20];
		for (int i=0; i<20; i++){
			if(i%3==0){
				continue;
			}
			decimalArray[i]=i/3;
		}
		return decimalArray;
	}

	
	
	
	private static boolean readStudentRecord(int studentRecord[][]) {
		boolean result= true;
		int length = studentRecord.length;
		for(int row =0; row<length; row++){
			if(studentRecord[row][1]>=75){
				// do nothing 				
			}else{
				result=false;
				System.out.println("The student mark less than 75 is : " + studentRecord[row][1]);
				break;
			}
		}
		return result;
	}

	
}
