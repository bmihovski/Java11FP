package collection;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Iteration {

	public static void main(String[] args) {
		final List<String> friends =
				Arrays.asList("Brian", "Nate", "Neil", "Raju", "Sara");
		for (String name : friends) {
			System.out.println(name);
		}
		
		friends.forEach(new Consumer<String>() {
			public void accept(final String name) {
				System.out.println();
				System.out.println(name);
			}
		});
		
		friends.forEach((final String name) -> System.out.println(name));
		
		friends.forEach(System.out::println);

	}

}
