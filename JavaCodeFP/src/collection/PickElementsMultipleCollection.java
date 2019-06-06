package collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PickElementsMultipleCollection {

	public static void main(String[] args) {
		final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
		final List<String> editors = Arrays.asList("Brian", "Jackie", "John", "Mike");
		final List<String> comrades = Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");
		
		final Predicate<String> startWithN = name -> name.startsWith("N");
		
		final long countFriendsStartN = 
				friends.stream()
					   .filter(startWithN)
					   .count();
		
		final long countEditorsStartWithN =
				editors.stream()
					   .filter(startWithN)
					   .count();
		
		final long countComaradesStartN =
				comrades.stream()
						.filter(startWithN)
						.count();
		
		System.out.println(countFriendsStartN);
		System.out.println(countEditorsStartWithN);
		System.out.println(countComaradesStartN);
	}

}
