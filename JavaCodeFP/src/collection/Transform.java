package collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Transform {

	public static void main(String[] args) {
		
		final List<String> friends =
				Arrays.asList("Brian", "Nate", "Neil", "Raju", "Sara");	
		final List<String> uppercaseNames = new ArrayList<String>();
		
		friends.forEach(name -> uppercaseNames.add(name.toUpperCase()));
		
		System.out.println(uppercaseNames);
		System.out.println();
		
		friends.stream()
				.map(name -> name.toUpperCase())
				.forEach(name -> System.out.println(name + " "));
		
		System.out.println();
		

	}

}
