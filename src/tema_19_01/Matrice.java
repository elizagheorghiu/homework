package tema_19_01;

import java.util.Arrays;
import java.util.Random;

public class Matrice {
		
	 static int [][] myMatrix = new int [5][5];
	 Random rand = new Random();
	{  for (int r=0;r<=5; r++) {
		for (int c = 0; c<5; c++) {
			
			myMatrix[r][c]= rand.nextInt();
			
			 System.out.print(Arrays.deepToString(myMatrix));	
		}
		System.out.print(Arrays.deepToString(myMatrix));;}
	}
	
	
}



		        
	
	 





	
	
	



    


