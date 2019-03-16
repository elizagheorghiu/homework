package tema_19_01;

import java.util.Arrays;

public class MatrixMethods extends Matrice {

	public static void listMatrix() {

		System.out.println(Arrays.deepToString(myMatrix));
	}

	public static void listFirstRow() {
		String firstRow = Arrays.toString(myMatrix[0]);
		System.out.print(firstRow);
	}

	public static void calculateMainDiagonal() {
		int sumMain = 0;
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (i == j) {
					sumMain = sumMain + myMatrix[i][j];
					System.out.println("Sum of the Main Diagonal is " + sumMain);
				}
			}
		}
	}

	public static void calculateSecondDiagonal() {
		int sumSecond = 0;
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4 - 1; j++) {
				if (j == 4 - i + 1) {
					sumSecond = sumSecond + myMatrix[i][j];
					System.out.println("Sum of the Second Diagonal is " + sumSecond);
				}
			}
		}
	}

	public static int getMaxValue() {
		int maxValue = myMatrix[0][0];
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				if (myMatrix[i][j] > maxValue) {
					maxValue = myMatrix[i][j];
				}
			}
		}
		System.out.println(maxValue);
		return maxValue;
	}

	public static int getMinValue() {
		int minValue = myMatrix[0][0];
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= j; j++) {
				if (myMatrix[i][j] < minValue) {
					minValue = myMatrix[i][j];
				}
			}
		}
		System.out.println(minValue);
		return minValue;
	}

}
