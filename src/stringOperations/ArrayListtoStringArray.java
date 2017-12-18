package stringOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListtoStringArray {

	public static void main(String[] args) {
		
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("four");
		stringList.add("five");
		stringList.add("six");
		
		Object[] objArray =  stringList.toArray();
		String[] stringArray = Arrays.copyOf(objArray, objArray.length, String[].class);
		for(int i = 0;i<stringArray.length;i++){
			System.out.println(stringArray[i]);
		}

	}

}
