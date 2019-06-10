package resources;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEAM {
	private final FileWriter writer;
	
	private FileWriterEAM(final String fileName) throws IOException {
		writer = new FileWriter(fileName);
	}
	
	private void close() throws IOException {
		System.out.println("Closed called automatically...");
		writer.close();
	}
	
	public void writeStuff(final String message) throws IOException {
		writer.write(message);
	}
	
	public static void use(final String fileName,
			final UseInstance<FileWriterEAM, IOException> block) throws IOException {
		final FileWriterEAM writerEAM = new FileWriterEAM(fileName);
		try {
			block.accept(writerEAM);
		} finally {
			writerEAM.close();
		}
	}

	public static void main(String[] args) throws IOException {
		FileWriterEAM.use("eam.txt", writeEAM -> writeEAM.writeStuff("sweet"));
		
		FileWriterEAM.use("eam2.txt", writeEAM -> {
			writeEAM.writeStuff("how");
			writeEAM.writeStuff("sweet");
		});
	}

}
