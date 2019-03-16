package tema_16_03;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class ReadFirstThreeLines {
	

	public static void main(String a[]) throws IOException{
		
		 String stringLine = "";
	        try {
	            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\History_of_Java.txt"), "UTF-8"));
	             while (((stringLine = reader.readLine()) != null) && reader.getLineNumber() <= 3){
	                System.out.println(stringLine);
	            }
	           reader.close();
	        } catch (FileNotFoundException e) {
	            System.err.println("File not found");
	        } catch (IOException e) {
	            System.err.println("Unable to read the file.");
	        }
	     }
	}

