package lazy;

import java.util.function.Supplier;

public class Evaluation {
	
	public static boolean evaluate(final int value) {
		System.out.println("evaluating ..." + value);
		simulateTimeConsumingOP(2000);
		return value > 100;
	}
	
	public static void simulateTimeConsumingOP(final int miliseconds) {
		try {
			Thread.sleep(miliseconds);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public static void eagerEvaluator(
			final boolean input1, final boolean input2) {
		System.out.println("eagerEvaluator called ...");
		System.out.println("accept?: " + (input1 && input2));
	}
	
	public static void lazyEvaluator(
			final Supplier<Boolean> input1,
			final Supplier<Boolean> input2 ) {
		System.out.println("lazyEvaluator called ...");
		System.out.println("accept?:" + (input1.get() && input2.get()));
	}

	public static void main(String[] args) {
		eagerEvaluator(evaluate(1), evaluate(2));
		lazyEvaluator(() -> evaluate(3), () -> evaluate(4));

	}

}
