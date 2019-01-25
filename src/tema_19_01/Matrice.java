package tema_19_01;

import java.util.Random;

public class Matrice {
	
	
	    
    static int rowWidth = 5;

	static int colHeight = 5;

	Random random = new Random();
	
	int randomNumber = random.nextInt();
    
	 static int [][] myMatrix = new int [rowWidth][colHeight];
	
	{  for (int r=0;r<=myMatrix.length; r++) {
		for (int c = 0; c<=myMatrix[r].length; c++) {
			
			myMatrix[r][c]= randomNumber;
			
			 System.out.print(myMatrix[r][c]);	
		}
	System.out.println(myMatrix);}
	
	
	
	}
}



		        
	
	 





	
	
	



    


