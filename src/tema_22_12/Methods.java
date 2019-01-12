package tema_22_12;

public interface Methods {

	 public void addContact(String place, String phoneNumber, String firstName, String lastName );
	 
	 public void listContacts();
	 
	 public void sendMessage(String phoneNumber, String messageContent);
	 
	 public void listMessages(String phoneNumber);
	 
	 public void call(String phoneNumber);
	 
	 public void viewHistory ();
}
