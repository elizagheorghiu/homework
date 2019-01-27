package tema_22_12.phones;

public class TestPhone {

	public static String firstName;
	public static String place;
	public static String phoneNumber;
	public static String lastName;

	public static void main(String[] args) {
		
		// Phone phone= new Samsung(); // shouldn't compile

	       Phone phone = new SamsungGalaxyS6(12121);



	       phone.addContact("1", "phone number", "fist name", "last name");

	       phone.addContact("2", "phone number", "fist name", "last name");

	       phone.listContacts();



	       // send a message to the first contact from the previous listed

	        // max number of characters - 100

	       phone.sendMessage("phone number", "message content");

	       phone.listMessages("phone number");



	        // send a message to the second contact from the previous listed

	       phone.call("phone number");

	       phone.viewHistory();
		
		
	}
}
