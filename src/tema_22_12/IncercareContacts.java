package tema_22_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IncercareContacts {
	String place;
	String phoneNumber;
	String firstName;
	String lastName;
	
	private Scanner sc;  
	
		public void Contact(String place, String phoneNumber, String firstName, String lastName) {
		sc = new Scanner(System.in); 

		System.out.println("Please add a number corresponding with the position of the contact in the addressbook");
		this.place = sc.nextLine();
		System.out.println("Please add the phone number");
		this.phoneNumber = sc.nextLine();
		System.out.println("Please add the first name");
		this.firstName = sc.nextLine();
		System.out.println("Please add the last name");
		this.lastName = sc.nextLine();
		System.out.println("Your new contact has been added on position"+ place + "with phone number" + phoneNumber + "and name" + firstName + lastName);	
		
		Contact c= new Contact(place, phoneNumber,firstName, lastName);
		ArrayList<Contact> list = null;
		list.add(c);
	
	}
	
	public static void main(String[] args) {
		toString(Contacts);
		}
	
	}


