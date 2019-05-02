package tema_16_03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Java_8

{
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		
	    String anyCommand="your command";
	    
	    BufferedReader br;
	    
 br = new BufferedReader(new FileReader("C:\\Users\\Eliza.Gheorghiu\\Desktop\\tema.txt")); 
        
        String st; 
        while ((st = br.readLine()) != null) 
          System.out.println(st); 
                  
	    anyCommand = in.nextLine();
	    
	      
	    try {
	        Process process = Runtime.getRuntime().exec("cmd /c start cmd.exe /K " + anyCommand);
	        System.out.println("Your command to " + anyCommand + " was executed");

	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	}

	

