import java.util.stream.IntStream;

public class Parallel {

	public static void main(String[] args) {
		//count the even numbers from 0 to one billion
		long startTime = System.currentTimeMillis();
		long counted = IntStream.rangeClosed(0, 1000000000)
				.filter(i -> i % 2 == 0)
				.count();
		long duration = System.currentTimeMillis() - startTime;
		System.out.println("the number of evens: " + counted + " time for execution: " + duration);
		// 1677 millis record the duration
		long startTimePar = System.currentTimeMillis();
		long countedPar = IntStream.rangeClosed(0, 1000000000)
				.parallel()
				.filter(i -> i % 2 == 0)
				.count();
		long durationPar = System.currentTimeMillis() - startTimePar;
		System.out.println("the number of evens: " + countedPar + " time for execution: " + durationPar);
		// 1250 millis record the duration from parallel

	}

}
