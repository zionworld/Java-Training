package learn;

public class OddEvenIdentifier {

	public static void main(String[] args) {

		int[] numberList = { 4, 7, 8, 2, 6, 1, 0, 4, 5 };

		int smallest = numberList[0];
		int largest = numberList[0];
		for (int i = 0; i < numberList.length; i++) {
			if (numberList[i] > largest) {
				largest = numberList[i];
			} else if (numberList[i] < smallest) {
				smallest = numberList[i];
			}
		}
		
		System.out.println("The largest number is "+largest);
		System.out.println("The smallest number is "+smallest);

	}

}
