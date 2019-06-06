package collection;
import static collection.Folks.friends;
import static java.util.stream.Collectors.joining;

public class PrintList {

	public static void main(String[] args) {
		System.out.println(String.join(", ", friends));
		
		System.out.println(
				friends.stream()
					   .map(String::toUpperCase)
					   .collect(joining(", "))
				);

	}

}
