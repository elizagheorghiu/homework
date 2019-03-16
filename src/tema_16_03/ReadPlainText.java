package tema_16_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadPlainText {

	private static BufferedReader br;

	public static void main(String a[]) throws IOException{
       
        br = new BufferedReader(new FileReader("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\History_of_Java.txt")); 
        
        String st; 
        while ((st = br.readLine()) != null) 
          System.out.println(st); 
        } 
      } 


