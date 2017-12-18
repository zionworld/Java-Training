package javalearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayOfColors {

	public static void main(String[] args) {

		List<String> coloursArray = new ArrayList<String>();

		// Violet, Indigo, Blue, Green, Yellow, Orange, Red
		coloursArray.add("Red");
		coloursArray.add("Yellow");
		coloursArray.add("Blue");
		coloursArray.add("Violet");
		coloursArray.add("Indigo");
		coloursArray.add("Green");
		coloursArray.add("Orange");

		// Printing the ArrayList
		System.out.println("VIBGYOR expanded as " + coloursArray);

		// Search for an item in the list
		for (String i : coloursArray) {
			while (i == "Violet") {
				System.out.println("The searched colour is identified :" + i);
				break;

			}

		}

		// update an item
		coloursArray.set(3, "Updated");
		System.out.println(coloursArray);

		// remove one item
		coloursArray.remove(3);
		System.out.println(coloursArray);

		// sorting the arrayList
		Collections.sort(coloursArray);
		System.out.print(coloursArray);

		// Copied to a new Array List
		System.out.println("The new Array List");
		List<String> newColours = new ArrayList(coloursArray);
		System.out.println(newColours);

		// reverse the order
		Collections.reverse(newColours);
		System.out.println(newColours);

		// shuffle the list
		Collections.shuffle(newColours);
		System.out.println(newColours);

		// extract a portion of list
		System.out.println(newColours.subList(2, 4));

		// remove one item
		coloursArray.remove(3);
		System.out.println(newColours);

		// Compare 2 lists
		System.out.println(coloursArray.containsAll(newColours));
	}

}
