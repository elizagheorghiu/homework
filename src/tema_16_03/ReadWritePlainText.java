package tema_16_03;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;


public class ReadWritePlainText {
	 
	
	public static void main(String a[]) {
		StringBuilder sb = new StringBuilder();
		String stringLine = "";
		try {
			String fileName = ("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\History_of_Java.txt");
			FileWriter writer = new FileWriter(fileName, false);

			writer.write("Eliza writes");
			writer.close();
			BufferedReader br = new BufferedReader(
					new FileReader("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\History_of_Java.txt"));

			stringLine = br.readLine();
			System.out.println(stringLine);

			br.close();
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
	}
}
      
