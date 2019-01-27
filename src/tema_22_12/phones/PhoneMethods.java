package tema_22_12.phones;

import java.util.List;

public abstract class PhoneMethods {


	 public abstract void addContact(String place, String phoneNumber, String firstName, String lastName );
	 
	 public abstract void listContacts();
	 
	 public abstract void sendMessage(String phoneNumber, String messageContent);
	 
	 public abstract void listMessages(String phoneNumber);
	 
	 public abstract void call(String phoneNumber);
	 
	 public abstract void viewHistory ();
}
