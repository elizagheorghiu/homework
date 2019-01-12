package tema_24_11;
import java.util;
import java.util.Scanner;
public class PalindromeMetode {
	public static void main (String [] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a positive integer");
		int number; 
		number = sc.nextInt();
		boolean result; 
		result = isPalindrome(number);
		System.out.println(result);
	}
	public static double Reverse (int number) {
		int result = 0; 
		int rest;
		while (number>0)	{
			rest = number%10;
			result = (result * 10) + rest;
			number = number/10;
		}
		return result; 
		
	}
	public static boolean isPalindrome (int number) {
		int n= (int) Reverse(number);
		boolean result = false; 
		if (n==number) {
			result = true; 
			System.out.println("The number "+ number + "is a palindrome");
		} else if (n!=number){ 
				result = false; 
				System.out.println("The number"+ number + "is not a palindrome");
			}
		return result;
			
		
	}
}