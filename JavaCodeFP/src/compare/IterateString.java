package compare;

public class IterateString {
	
	private static void printChar(int aChar) {
		System.out.println((char) (aChar));
	}

	public static void main(String[] args) {
		final String str = "w00t";
		
		str.chars()
		   .forEach(IterateString::printChar);
		
		str.chars()
		   .mapToObj(ch -> Character.valueOf((char)ch))
		   .forEach(System.out::println);
		
		str.chars()
		   .filter(Character::isDigit)
		   .forEach(IterateString::printChar);

	}

}
