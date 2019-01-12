package tema_24_11;
import java.util.Scanner;
public class Calculator {
public static void main (String [] args) {
	int a;
	int b; 
	int operator;
	Scanner sc = new Scanner(System.in);
	System.out.println("Type first number");
	a = sc.nextInt();
	System.out.println("Type second number");
	b = sc.nextInt();
	System.out.println("Choose arithmetic operator");
	System.out.println("1.sum");
	System.out.println("2.dif");
	System.out.println("3.prod");
	System.out.println("4.div");
	operator = sc.nextInt();
	switch (operator)
	{case 1:
		System.out.println(getSum(a,b));
		break;
	case 2:
		System.out.println(getDif(a,b));
		break;
	case 3:
		System.out.println(getProd(a,b));
		break;
	case 4:
		System.out.println(getDiv(a,b));
		break;
	}
}
	public static int getSum(int a, int b) {
		int z = a + b;
		return z;
		}
	public static int getDif(int a, int b) {
		int z = a - b;
		return z;
		}
	public static int getProd(int a, int b) {
		int z= a *b;
		return z;
		}
	public static float getDiv(int a, int b) {
		float z = a/b;
		return z;
		}
}


