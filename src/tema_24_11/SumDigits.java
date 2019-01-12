package tema_24_11;
import java.util.Scanner;
public class SumDigits {
	private static Scanner sc;
	private static int Sum = 0;
	public static void main(String[] args) {
		int Number;
		sc = new Scanner(System.in);		
		System.out.println("Please Enter any Number: ");
		Number = sc.nextInt();
		
		Sum = SumofDigits(Number);
		System.out.format("Sum of the digits of Given Number = %d", Sum);
	}
	public static int SumofDigits(int Number) {
		int Reminder;
		for (Sum = 0; Number > 0;Number = Number/10) {
			Reminder = Number % 10;
			Sum = Sum+ Reminder;
		}
		return Sum;
	}
}