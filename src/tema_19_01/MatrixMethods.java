package tema_19_01;

import java.util.Arrays;

public class MatrixMethods extends Matrice {

	public static void listMatrix() 
	{
		//String list = Arrays.deepToString(myMatrix);
     	System.out.print(Arrays.toString(myMatrix));
	}
     	
     public static void listFirstRow() 
     { 
    	String firstRow = Arrays.toString(myMatrix[0]);
     	System.out.print(firstRow);
     }
	 
     public static void calculateMainDiagonal() 
     { 
    	 int sumMain = 0;
    	 for (int row=0;row<rowWidth; row++) {
    			for (int col = 0; col<myMatrix[row].length; col++) {
    				if (row ==col) {
    				sumMain = sumMain + myMatrix[row][col];
    					System.out.println("Sum of the Main Diagonal is " + sumMain);
    				}
        }
	         }
     }
     
     public static void calculateSecondDiagonal()
     {   int sumSecond = 0;
    	 for (int row=0;row<rowWidth-1; row++) {
 			for (int col = 0; col<myMatrix[row].length; col++) {
 				if ( col == rowWidth -row +1) {
 				sumSecond = sumSecond + myMatrix[row][col];
 					System.out.println("Sum of the Second Diagonal is " + sumSecond);
 				}
     }
	         }
     }
     
     
     
     
     public static int getMaxValue() {
         int maxValue = myMatrix[0][0];
         for (int row = 0; row < myMatrix.length; row++) {
             for (int col = 0; col < myMatrix[row].length; col++) {
                 if (myMatrix[row][col] > maxValue) {
                     maxValue = myMatrix[row][col];
                 }
             }
         }
         return maxValue;
}
     
     public static int getMinValue() {
         int minValue = myMatrix[0][0];
         for (int row = 0; row < myMatrix.length; row++) {
             for (int col = 0; col < myMatrix[row].length; col++) {
                 if (myMatrix[row][col] < minValue) {
                     minValue = myMatrix[row][col];
                 }
             }
         }
         return minValue;
}

}


     
     

