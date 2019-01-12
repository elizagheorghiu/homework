package tema_22_12;

import java.util.Scanner;

public class SamsungS6 extends Samsung{

	public SamsungS6(int imei) {
		super(imei);
	final int batteryLife = 17;
			
	}
	
	@Override
	public String material() {
		return "hard plastic";
	}

	@Override
	public String color() {
		return "grey";
	}
	
	@Override
	public void sendMessage(String phoneNumber, String messageContent) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please write the phone number");
		phoneNumber = sc.toString();
		System.out.println("Please write your message");
		messageContent = sc.toString();
		// int batteryremaining = getbatteryLife -2; 
	}
}
	
