package tema_22_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Phone implements Methods{

	
	
	
	public Phone (int imei) {
	}
	
	  List Contacts = new ArrayList<>();
	private Scanner in; 
	  
	  public void addContacts() {
	  
		  in = new Scanner(System.in); 
		  System.out.println("Contact Place: "); 
		  Contacts.add(in.nextLine()); 
		  System.out.println("Contact Phone Number: ");
		  Contacts.add(in.nextLine()); 
		  System.out.println("Contact First Name: "); 
		  Contacts.add(in.nextLine()); 
		  System.out.println("Contact Last Name: "); 
		  Contacts.add(in.nextLine()); 
		  } 
	  public List getContacts() {
		  return Contacts; 
		  }	
	
	//*public void addContact(String place, String phoneNumber, String firstName, String lastName) {
//		Scanner sc = new Scanner(System.in); 
//
//		System.out.println("Please add a number corresponding with the position of the contact in the addressbook");
//		place = sc.nextLine();
//		System.out.println("Please add the phone number");
//		phoneNumber = sc.nextLine();
//		System.out.println("Please add the first name");
//		firstName = sc.nextLine();
//		System.out.println("Please add the last name");
//		lastName = sc.nextLine();
//		System.out.println("Your new contact has been added on position"+ place + "with phone number" + phoneNumber + "and name" + firstName + lastName);	
	//	
//	}

		public void sendMessage(String phoneNumber, String messageContent) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please write the phone number");
		phoneNumber = sc.toString();
		System.out.println("Please write your message");
		messageContent = sc.toString();
		if (messageContent.length() < 500) {
			//int batteryremaining = batterylife - 1;
			System.out.println("Your message was sent");
		} else {
				System.out.println("Your message exceeds the maximum characters");
				}
		}
			
	public void listMessages(String phoneNumber) {
		
	}

	
	public void call(String phoneNumber) {
		//int batteryremaining = batterylife - 1;
				
	}

	
	public void viewHistory() {
				
	}


	public String color() {
		return "pink";
	}
	

	public String material() {
		return "plastic";
	}



	@Override
	public void listContacts() {
		
		
	}
	@Override
	public void addContact(String place, String phoneNumber, String firstName, String lastName) {
		
		
	}
	
	

}

