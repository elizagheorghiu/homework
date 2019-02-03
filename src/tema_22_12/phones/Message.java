package tema_22_12.phones;

public class Message {
	
	
    private String phoneNumber;
    private String messageContent;
    
    public Message(String phoneNumber, String messageContent){
        
    	this.phoneNumber=phoneNumber;
    	this.messageContent = messageContent;
        
     }

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}
 
}
