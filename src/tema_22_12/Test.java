package tema_22_12;


public class Test {
	
	public static String firstName;
	public static String place;
	public static String phoneNumber;
	public static String lastName;

	public static void main(String[] args) {
		  Phone phone = new Nokia210(1323);
		   System.out.println(phone);
		  		     
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

	public static void setFirstName(String firstName) {
		Test.firstName = firstName;
	}

	public static String getFirstName() {
		return firstName;
	}

  
	
}
