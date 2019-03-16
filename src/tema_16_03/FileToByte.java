package tema_16_03;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileToByte {
	public static void main(String[] args) throws IOException  {
		byte[] array = Files.readAllBytes(new File("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\Texts for Homework\\File_2.docx").toPath());
		System.out.println(array);
	}
}
