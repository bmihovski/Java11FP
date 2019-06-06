package collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PickDifferentNames {

	public static void main(String[] args) {
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		
		final Function<String, Predicate<String>> checkIfStartsWithLetter = 
			letter -> name -> name.startsWith(letter);
		
		final long countFriendsStartWithN =
				friends.stream()
					   .filter(checkIfStartsWithLetter.apply("N"))
					   .count();
		
		final long countFriendsStartWithB =
				friends.stream()
					   .filter(checkIfStartsWithLetter.apply("B"))
					   .count();
		
		System.out.println(countFriendsStartWithB);
		System.out.println(countFriendsStartWithN);
		

	}

}
