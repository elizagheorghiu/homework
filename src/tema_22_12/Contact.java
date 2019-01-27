package tema_22_12;

public class Contact {
	
    private String place;
    private String phoneNumber;
    private String firstName;
    private String lastName;
    
 
    public Contact(String place, String phoneNumber, String firstName, String lastName){
        
    	this.place = place;
        this.phoneNumber=phoneNumber;
    	this.firstName = firstName;
        this.lastName = lastName;
     }
 



public String getPlace() {
	return place;
}


public void setPlace(String place) {
	this.place = place;
}


public String getPhoneNumber() {
	return phoneNumber;
}


public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}
public void listContacts() {
	System.out.println(this.getPlace());
	System.out.println(this.getPhoneNumber());
	System.out.println(this.getFirstName());
	System.out.println(this.getLastName());

}




} 




