package stringOperations;

public class ConvertStringToArray {

	public static void main(String[] args) {
		
		String finalString = "This string needs to convert to Array";
		char[] stringArray = finalString.trim().toCharArray();
		
		for(int i=0;i<stringArray.length;i++){
			System.out.println(stringArray[i]);
		}
	}

}
