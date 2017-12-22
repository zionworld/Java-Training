package dataStructure;

public class Arrays {

	public static void main(String[] args) {
		//Declaring an array
		String[] alphabet = {"a","b","c","d","e","f"};
		
		//iterating through array
		System.out.println("Printing the alphabets using old loop");
		for(int i=0;i<alphabet.length;i++){			
			System.out.print(" "+alphabet[i]);
		}
		
		//iterating though array using advance for loop (For each)
		System.out.println("\n \n Printing the alphabets using For-Each method");
		for (String n : alphabet){
			System.out.print(" "+n);
		}
	}

}
