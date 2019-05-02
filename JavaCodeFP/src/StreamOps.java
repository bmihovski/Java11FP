import java.util.Arrays;
import java.util.Comparator;

public class StreamOps {

	public static void main(String[] args) {
		Integer[] integers = new Integer[] {1, 23, 76, 92, -76, 956, 365, 990, -256};
		Arrays.stream(integers)
			.map( i->i*i)
			.forEach(System.out::println);
		Integer intsInteger = Arrays.stream(integers)
				.min(Comparator.naturalOrder()).get();
		System.out.println("the integer is: " + intsInteger);
		boolean isAnySmaller = Arrays.stream(integers)
				.anyMatch(i->i<0);
		System.out.println("the boolean value is " + isAnySmaller);
	}

}
