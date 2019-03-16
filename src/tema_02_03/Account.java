package tema_02_03;

public class Account {
	int PIN;
	String AccountInfo;
	int balance;
	
	public int getBalance() {
		return balance;
	}

	public int getPIN() {
		return PIN;
	}

	public String getAccountInfo() {
		return AccountInfo;
	}
	
	public Account(int PIN, String AccountInfo, int balance) {
		this.PIN=PIN;
		this.AccountInfo=AccountInfo;
		this.balance=balance;
		
	}
	
	
	
}
