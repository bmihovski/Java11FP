package compare;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ListSelectFiles {

	public static void main(String[] args) throws IOException {
		Files.newDirectoryStream(Paths.get("C:\\Users\\git\\Java11FP\\JavaCodeFP\\src\\compare"),
				path -> path.toString().endsWith(".java"))
				.forEach(System.out::println);

	}

}
