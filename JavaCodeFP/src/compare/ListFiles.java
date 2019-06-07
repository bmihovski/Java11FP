package compare;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ListFiles {

	public static void main(String[] args) throws IOException {
		Files.list(Paths.get("."))
			 .forEach(System.out::println);
		
		Files.list(Paths.get("."))
		     .filter(Files::isDirectory)
		     .forEach(System.out::println);

	}

}
