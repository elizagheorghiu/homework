package tema_02_03;

public class Account {

	static double accountBalance;

	public double getAccountBalance() {
		return getAccountBalance();
	}

	public static void setAccountBalance(double accountBalance) {
		Account.accountBalance = accountBalance;
	}

	public int getPin() {
		return pin;
	}

	public static void setPin(int pin) {
		Account.pin = pin;
	}

	static public int pin;

	public Account(double accountBalance, int pin) {

		Account.accountBalance = accountBalance;
		Account.pin = pin;

	}

}
