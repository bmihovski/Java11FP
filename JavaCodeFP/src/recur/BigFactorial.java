package recur;

import java.math.BigInteger;
import static recur.TailCalls.done;
import static recur.TailCalls.call;

public class BigFactorial {
	public static BigInteger decrement(final BigInteger number) {
		return number.subtract(BigInteger.ONE);
	}
	
	public static BigInteger multiply(final BigInteger first,
			final BigInteger second) {
		return first.multiply(second);
	}
	
	final static BigInteger ONE = BigInteger.ONE;
	
	final static BigInteger FIVE = BigInteger.valueOf(5);
	
	final static BigInteger TWENTYK = BigInteger.valueOf(20000);
	
	public static TailCall<BigInteger> factorialTailRec(
			final BigInteger factorial, final BigInteger number) {
		if (number.equals(BigInteger.ONE)) {
			return done(factorial);
		} else {
			return call(() ->
			factorialTailRec(multiply(factorial, number), decrement(number)));
		}
	}
	
	public static BigInteger factorial(final BigInteger number) {
		return factorialTailRec(BigInteger.ONE, number).invoke();
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(FIVE));
		
		System.out.println(String.format("%.10s...", factorial(TWENTYK)));
	}
	
	
	
	
	
}
