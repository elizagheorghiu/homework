package tema_02_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Transaction {

	static Scanner in = new Scanner(System.in);
	static ArrayList<Account> account = new ArrayList<Account>();
	static ArrayList<User> user = new ArrayList<User>();

////	public void addUser(User aUser) {
////		Transaction.user.add(aUser);
////	}
////	
////	public void addAccount (Account anAccount) {
////		Transaction.account.add(anAccount);
//}
	static Map<User, Account> mylist = new HashMap<>();

	Account account1 = new Account(100003232, 1243);
	Account account2 = new Account(43422230, 2435);
	Account account3 = new Account(323030232, 4343);
	Account account4 = new Account(4342340, 7643);
	Account account5 = new Account(43484, 1993);

	User user1 = new User("Eliza", "Gheorghiu", "EG");
	User user2 = new User("Vasile", "Pop", "VP");
	User user3 = new User("Roxana", "Prozan", "RP");
	User user4 = new User("Anne-Marie", "Popa", "AP");
	User user5 = new User("Liliana", "Oberling", "LO");

//		account.add(account1);
//		account.add(account2);
//		account.add(account3);
//		account.add(account4);
//		account.add(account5);
//		
//		user.add(user1);
//		user.add(user2);
//		user.add(user3);
//		user.add(user4);
//		user.add(user5);
//		
//		mylist.put(user5, account5);
//		mylist.put(user4, account4);
//		mylist.put(user3, account3);
//		mylist.put(user2, account2);
//		mylist.put(user1, account1);

	static void checkID() {

		System.out.println("Welcome! Please input your user ID");
		String userID = in.nextLine();
		{
			for (User u : user) {
				if (userID.equals(u.getUserID()))
				// if (u.getUserID().equals(userID))
				{
					System.out.println(" Please input your PIN");
					int checkPIN;
					checkPIN = in.nextInt();
					if (mylist.containsValue(in)) {
						System.out.println("welcome!");
						transaction();
					}
				} else
					throw new IllegalArgumentException("wrong user ID/PIN");
			}
		}
	}

	static void transaction() {
		int choice;
		System.out.println("Please select an option");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Balance interogation");
		System.out.println("4. Pin change");
		System.out.println("5. View account info");
		System.out.println("6. Quit");

		choice = in.nextInt();

		int depositAmount;
		switch (choice) {
		case 1:
			int withdrawAmount;
			System.out.println("Please enter amount to withdraw: ");
			withdrawAmount = in.nextInt();
			double balance = 0;
			balance = Account.accountBalance;

			if (withdrawAmount > balance) {
				throw new IllegalArgumentException("insufficient funds");

			} else {
				Account.setAccountBalance(balance - withdrawAmount);

				System.out.println(
						"You have withdrawn " + withdrawAmount + " and your new balance is " + Account.accountBalance);
				transaction();
			}
			break;
		case 2:
			System.out.println("Please enter amount to deposit: ");
			depositAmount = in.nextInt();
			if (depositAmount % 10 != 0) {
				throw new IllegalArgumentException(
						"please enter a multiple of 10. The machine accepts only multiples of 10$ bills.");
			} else {
				Account.setAccountBalance(Account.accountBalance + depositAmount);
				System.out.println(
						"You have deposited " + depositAmount + " and your new balance is " + Account.accountBalance);
				transaction();
				;
			}
			break;
		case 3:
			System.out.println("Your balance is " + Account.accountBalance + "\n");
			transaction();
			break;
		case 4:
			int newPIN;
			System.out.println("Please enter a 4 digit number for your new PIN: ");
			newPIN = in.nextInt();
			int lenght = 0;
			newPIN = lenght;

			if ((lenght = Integer.toString(newPIN).length()) < 3) {
				throw new IllegalArgumentException("PIN must have 4 digits!");

			}
			int pin1 = newPIN;
			Account.setPin(newPIN);

			System.out.println("You have successfully changed your PIN");
			transaction();
			;
			break;
		case 5:
			System.out.println("Please see your account info: " + Account.accountBalance + User.getLastName()
					+ User.getFirstName());

			transaction();
			;
			break;
		case 6:
			System.out.println("Thank you! Have a nice day ");
			break;

		default:
			System.out.println("Invalid option:\n\n");
			transaction();
			;
			break;
		}
	}

}
