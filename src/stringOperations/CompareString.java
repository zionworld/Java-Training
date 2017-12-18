package stringOperations;

public class CompareString {

	public static void main(String[] args) {
		
		//2 string comparison
		String str1 = "Hello";
		String str2 = "Hello";
		if(str1 == str2){
			System.out.println("Equal");
		}
		//String concatenation
		String finalstring = str1+str2;
		System.out.println(finalstring);
		
		String str3 = str1;
		System.out.println(str3);
		System.out.println(str1);
		
		//compareTO()
		String str5 = new String("Hello");
		String str4 = "Hello";
		System.out.println(str1.compareTo(str4));
		System.out.println(str1.compareTo(str5));
		if(str1 == str2){
			System.out.println("Equal");
		}
		
		

		int num1 = 24;
		int num2 = 24;
		if(num1==num2){
			System.out.println("Equal");
		}
		
		
	}

}
