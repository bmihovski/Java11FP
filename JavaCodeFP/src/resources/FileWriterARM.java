package resources;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterARM implements AutoCloseable {
	private final FileWriter writer;
	
	public FileWriterARM(final String fileName) throws IOException {
		writer = new FileWriter(fileName);
	}
	
	public void writeStuff(final String message) throws IOException {
		writer.write(message);
	}
	
	public void close() throws IOException {
		System.out.println("Close called automatically...");
		writer.close();
	}

	public static void main(String[] args) throws IOException {

		try (final FileWriterARM writeARM = new FileWriterARM("peekaboo.txt")) {
			writeARM.writeStuff("peek-a-boo");
			System.out.println("done with the resource...");
		} 

	}

}
