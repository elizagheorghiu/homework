package tema_16_02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineStoreVar {

	  public static void main(String a[]){
	        String stringLine = "";
	        String stringVariable = "";
	        try {
	             BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\History_of_Java.txt"));
	             while (stringLine != null)
	             {
	                if (stringLine == null)
	               
	                stringVariable += stringLine;
	                stringLine = br.readLine();
	                
	            }
	              System.out.println(stringVariable);
	             br.close();
	        } catch (FileNotFoundException e) {
	            System.err.println("File not found");
	        } catch (IOException e) {
	            System.err.println("Unable to read the file.");
	        }
	     }
	}
	

