package recur;

import static recur.TailCalls.done;
import static recur.TailCalls.call;

public class Factorial {

	public static int factorialRec(final int number) {
		if (number == 1)
			return number;
		else
			return number * factorialRec(number - 1);
	}

	public static TailCall<Integer> factorialTailRec(final int factorial, final int number) {
		if (number == 1) {
			return done(factorial);
		} else {
			return call(() -> factorialTailRec(factorial * number, number - 1));
		}
	}

	public static void main(String[] args) {
		System.out.println(factorialRec(5));

		try {
			System.out.println(factorialRec(20000));
		} catch (StackOverflowError ex) {
			System.out.println(ex);
		}

	}

}
