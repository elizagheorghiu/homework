package tema_22_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Phone extends PhoneMethods  {

	public Phone (int imei) {
	}
	int batteryLife;
	int batteryRemaining;
	String color;
	String material;

	List <Message> ListMessages = new ArrayList<>();
	List <Contact> Contacts = new ArrayList<>();
	List <Contact> History = new ArrayList<>();
	
	

	@SuppressWarnings("unused")
	public void addContact(String place, String phoneNumber, String firstName, String lastName ) {
		Contact Contact = new Contact(place, phoneNumber, firstName,lastName);
		Contacts.add(Contact);
	} 

		public void sendMessage(String phoneNumber, String messageContent) {


		Message Message = new Message(phoneNumber, messageContent);

		if (messageContent.length() < 500) {
			batteryRemaining = batteryLife - 1;
			System.out.println("Your message was sent");
			ListMessages.add(Message);
		} else {
			System.out.println("Your message exceeds the maximum characters");
		}
	}

	public void listMessages(String phoneNumber) {
		for (Message Message : ListMessages) {
			if (Message.getPhoneNumber().equals(phoneNumber)) {
				Message.getMessageContent();
			
				System.out.println("You have sent this message" + Message.getMessageContent() + " to this phone number: " + phoneNumber);
				
				ListMessages.forEach(System.out::println);
			}
		}
	}


	public void call(String phoneNumber) {
		int call=0;
		for( Contact Contact: Contacts) {
			if(Contact.getPhoneNumber().equals(phoneNumber) ) {
				call++;
				batteryRemaining= batteryLife - 2;
				System.out.println("you have called this number:" + Contact.getPhoneNumber());
				History.add(Contact);
			}
		
		}
		
	}


	public void viewHistory() {
		History.forEach(System.out::println);
	}

	@Override
	public void listContacts() {
		Contacts.forEach(System.out::println);
		
	}


}





