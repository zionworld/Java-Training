package dataStructure;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		//Define array list
		ArrayList<String> cities = new ArrayList<String>();
		
		//Add some elements
		cities.add("Toronto");
		cities.add("New York");
		cities.add("California");
		
		//Iterate to collection
		for (String city : cities){
		System.out.println(city);
		}
		
		//Print size of the collection
		int size = cities.size();
		System.out.println("There are "+size +" elements are there in the collection");
		
		//Retrieve specific elements		
		System.out.println(cities.get(1));
		
		//Remove from collection
		cities.remove(1);
		System.out.println(cities);
		System.out.println(cities.size());
		for (String city : cities){
			System.out.println(city);
		}
		
	}

}
