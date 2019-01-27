package tema_22_12.phones;

import java.util.ArrayList;
import java.util.List;

public class Contact {

	public static String firstName;
	public static String place;
	public static String phoneNumber;
	public static String lastName;
	
	public Contact(String place, String phoneNumber, String firstName, String lastName)
	
	{
		this.place=place;
		this.phoneNumber= phoneNumber;
		this.lastName = lastName;
	    this.firstName = firstName;
	   
	}
	
	Contact c = new Contact(place, phoneNumber, firstName, lastName);
	
		
}


