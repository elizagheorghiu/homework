package tema_16_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Append {

	 public static void main(String a[]){
		    StringBuilder sb = new StringBuilder();
	        String stringLine = "";
	        try
	          {
	             String fileName= ("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\History_of_Java.txt");
	             BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\History_of_Java.txt"));
	            
	             while (stringLine != null)
	             {
	                sb.append(stringLine);
	                sb.append(System.lineSeparator());
	                stringLine = br.readLine();
	                System.out.println(stringLine);
	            }
	             br.close();                          
	           }
	           catch(IOException ioe)
	           {
	            System.err.println("IOException: " + ioe.getMessage());
	           }
	        }
	  }