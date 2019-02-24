package tema_22_12.phones;

public class TestPhone {

	public static String firstName;
	public static String place;
	public static String phoneNumber;
	public static String lastName;

	public static void main(String[] args) {

		// Phone phone= new Samsung(); // shouldn't compile

		Phone phone = new SamsungGalaxyS6(12121);

		phone.addContact("1", "0734367148", "Iulia", "Stanca");

		phone.addContact("2", "0734256888", "Alex", "Chelu");

		phone.addContact("3", "0734256878", "Vali", "Oberling");

		phone.addContact("4", "0734256848", "Ioana", "Rusu");

		phone.listContacts();

		// send a message to the first contact from the previous listed

		// max number of characters - 100

		phone.sendMessage("0734256848", "Pizza?");

		phone.listMessages("0734256848");

		// send a message to the second contact from the previous listed

		phone.call("0734367148");

		phone.viewHistory();

	}
}
