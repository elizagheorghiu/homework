package tema_02_03;

import java.util.ArrayList;

public class User {

	static private String firstName;
	static private String lastName;
	static private String userID;

	private ArrayList<Account> accounts;

	public User(String firstName, String lastName, String userID) {
		User.firstName = firstName;
		User.lastName = lastName;
		User.userID = userID;

	}

	public static String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		User.firstName = firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		User.lastName = lastName;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		User.userID = userID;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

}
