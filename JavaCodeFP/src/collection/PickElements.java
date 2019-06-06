package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PickElements {

	public static void main(String[] args) {
		final List<String> friends =
				Arrays.asList("Brian", "Nate", "Neil", "Raju", "Sara");
		final List<String> startsWithN = new ArrayList<String>();
		
		for (String name : friends) {
			if (name.startsWith("N")) {
				startsWithN.add(name);
			}
		}
		
		friends.stream()
		       .filter(name -> name.startsWith("N"))
		       .collect(Collectors.toList());
		
		System.out.println(String.format("Found %d names", startsWithN.size()));

	}

}
