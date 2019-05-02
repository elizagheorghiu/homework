package tema_16_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestLenght {
	private Scanner scan;
	public static void main(String[] args) throws FileNotFoundException {
		
		new LongestLenght().getLongestWords();
		
	}
		public String getLongestWords() throws FileNotFoundException {
		  String longestWord = "";
		    String current;
		    scan = new Scanner(new File("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\History_of_Java.txt"));


		    while (scan.hasNext()) {
		        current = scan.next();
		        if (current.length() > longestWord.length()) {
		            longestWord = current;
		        }

		    }
		    System.out.println(longestWord);
		            return longestWord;
		        }

		}	
	
	

