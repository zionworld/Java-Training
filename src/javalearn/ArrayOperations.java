package javalearn;

public class ArrayOperations {

	public static void main(String[] args) {

		int[] values = { 2, 3, 5, 9, 4, 8, 1, 3, 12 };
		System.out.println("The minimum value in the array is " + minimumVal(values));
		System.out.println("The maximum Value in the array is " + maximumVal(values));
		System.out.println("The average Value in the array is " + averageVal(values));
	}

	public static int minimumVal(int[] values) {

		int minVal = values[0];
		for (int i = 0; i < values.length; i++) {
			if (values[i] < minVal)
				minVal = values[i];
		}
		/* System.out.println(minVal); */
		return minVal;
	}

	public static int maximumVal(int[] values) {

		int maxVal = values[0];
		for (int i = 0; i < values.length; i++) {
			if (values[i] > maxVal)
				maxVal = values[i];
		}
		/* System.out.println(maxVal); */
		return maxVal;
	}

	public static int averageVal(int[] values) {
		int avgVal = values[0];
		for (int i = 0; i < values.length; i++) {
			/* if (values[i] > avgVal) */
			avgVal = values[i] + avgVal;
		}
		return avgVal / values.length;
	}

}
