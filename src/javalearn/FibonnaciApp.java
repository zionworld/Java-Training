package javalearn;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibo nnaci numbers is defines by the sum of 2 previous fibonnaci
		// numbers

		System.out.println(fib(0));
		System.out.println(fib(1));
		System.out.println(fib(2));
		System.out.println(fib(3));
		System.out.println(fib(4));
		System.out.println(fib(5));

	}

	public static int fib(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return (fib(n - 1) + fib(n - 2));
	}
}
