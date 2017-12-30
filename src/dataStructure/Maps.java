package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// Implement map interfaces
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		utilMap(hMap);
	}

	public static void utilMap(Map<Integer, String> map) {
		// Insert the values
		map.put(101, "Sreejith");
		map.put(102, "Shikha");
		map.put(103, "Sudish");
		map.put(104, "Sruthy");
		map.put(105, "Satish");
		map.put(106, "Mini");

		// Access the elements
		System.out.println("Prints the value with key 103 : " + map.get(103));
		System.out.println("Print all the keys in the map :" + map.keySet());

	}

}
