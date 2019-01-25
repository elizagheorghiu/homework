package tema_22_12;

import java.util.ArrayList;

public abstract class PhoneMethods {


	 public abstract void addContact(String place, String phoneNumber, String firstName, String lastName );
	 
	 public abstract ArrayList<Object> listContacts();
	 
	 public abstract void sendMessage(String phoneNumber, String messageContent);
	 
	 public abstract void listMessages(String phoneNumber);
	 
	 public abstract void call(String phoneNumber);
	 
	 public abstract void viewHistory ();
}
