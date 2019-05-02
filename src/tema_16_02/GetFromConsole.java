package tema_16_02;
import java.util.Scanner; 

public class GetFromConsole {

	  private static Scanner in;

	public static void main(String args[]) 
	    { 
	         
	        in = new Scanner(System.in); 
	  
	        
	        System.out.println("Please input text"); 
	        String text = in.nextLine(); 
	        System.out.println("You wrote text: "+" ' "+text+ " ' "); 
	  
	        
	    } 
	} 


