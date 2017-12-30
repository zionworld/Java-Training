package dataStructure;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets  {

	public static void main(String[] args) {
		
		//Set is always unique list
		//LinkedHashSet is in order that they were entered
		//HashSet is random
		//TreeSet is in the alphabetical order
		
		
		// Define of set
		Set<String> animals = new TreeSet<String>();

		// Adding the elements
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Elephant");
		animals.add("Dog");
		animals.add("Peacock");

		// Printing the elements
		System.out.println(animals.size() + " " + animals);

		animals.add("Bear");
		animals.add("Dear");
		animals.add("Cat");
		System.out.println(animals.size() + " " + animals);
		
		
		//Create new set for comparison
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("Chicken");
		farmAnimals.add("Horse");
		farmAnimals.add("Pig");
		farmAnimals.add("Duck");
		farmAnimals.add("Elephant");
		farmAnimals.add("Dog");
		farmAnimals.add("Cat");
		farmAnimals.add("Lion");
		System.out.println("Farm animals are : " + farmAnimals);
		
		//INTERSECTION between 2 sets
		//1. Copying one set to new set
		Set<String> intersectionSet = new HashSet<String>(animals);
		System.out.println("IntersectionSet : "+ intersectionSet);
		intersectionSet.retainAll(farmAnimals);
		System.out.println("Common elements :"+intersectionSet);
		
		//UNION set of animals and farmAnimals
		Set<String> unionSet = new HashSet<String>(animals);
		unionSet.addAll(farmAnimals);
		System.out.println("Union Set is :" + unionSet);
		
		//DIFFERENCE in both animals and farmAnimals
		Set<String> diffSet = new HashSet<String>(animals);
		diffSet.removeAll(farmAnimals);
		System.out.println("Difference between animals and farmAnimals are :"+diffSet);
	}

}
