package compare;

public class IterateString {

	public static void main(String[] args) {
		final String str = "w00t";
		
		str.chars()
		   .forEach(System.out::println);

	}

}
