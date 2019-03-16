package tema_02_03;

public class User {
	private String Name;
	private String AccountID;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAccountID() {
		return AccountID;
	}

	public void setAccountID(String accountID) {
		AccountID = accountID;
	}

	
		
	public User(String Name, String AccountID ) {
		this.Name=Name;
		this.AccountID=AccountID;
	}

	
	}

	

