package tema_08_12;
import java.util.Scanner;
public class Palindrome {
	private static Scanner sc;

	public static void main (String [] args ) {
		int n;
		int sum = 0;
		int rest;
		int mem;
		
		sc = new Scanner(System.in);
		System.out.println("Please input a positive integer");
			n =  sc.nextInt();
			mem = n; 
			while (n>0) {
				rest = n%10;
				sum = (sum*10) + rest ;
				n = n/ 10;				
					}
			if (mem == sum) {
				System.out.println("Number is a palindrome"); 
			} 
			System.out.println("Number is not a palindrome"); 
			
				}
			}
		
		

