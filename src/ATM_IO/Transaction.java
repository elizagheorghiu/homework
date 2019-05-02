package ATM_IO;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.util.stream.Stream;

public class Transaction {

	static Scanner in = new Scanner(System.in);

	static void checkID() {

		String filepath = "ATM.txt";
		String searchTerm = null;
		boolean found = false;
		String firstName = "";
		String lastName = "";
		String ID = "";
		String PIN = "";
		String balance = "";

		System.out.println("Welcome! Please input your user ID");
		String userID = in.nextLine();
		{

			try {
				in = new Scanner(new File(filepath));
				in.useDelimiter("[,\n]");

				while (in.hasNext() && found) {
					firstName = in.next();
					lastName = in.next();
					ID = in.next();
					balance = in.next();
					PIN = in.next();

					if (ID.equals(searchTerm))
						;
					{
						found = true;
					}
				}

				if (found) {
					System.out.println("please input your PIN");
					if (PIN.equals(in.next())) {
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

							int accountBalance;
							accountBalance = Integer.parseInt(balance);

							if (withdrawAmount > accountBalance) {
								throw new IllegalArgumentException("insufficient funds");

							} else {
								balance.replace(balance, Integer.toString((accountBalance - withdrawAmount)));

								System.out.println("You have withdrawn " + withdrawAmount + " and your new balance is "
										+ (accountBalance - withdrawAmount));
							}
							break;
						case 2:
							System.out.println("Please enter amount to deposit: ");
							depositAmount = in.nextInt();
							if (depositAmount % 10 != 0) {
								throw new IllegalArgumentException(
										"please enter a multiple of 10. The machine accepts only multiples of 10$ bills.");
							} else {
								accountBalance = Integer.parseInt(balance);
								balance.replace(balance, Integer.toString((accountBalance + depositAmount)));

								System.out.println("You have deposited " + depositAmount + " and your new balance is "
										+ (accountBalance + depositAmount));
								;
							}
							break;
						case 3:
							System.out.println("Your balance is " + balance);
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
							PIN.replace(PIN, Integer.toString(newPIN));

							System.out.println("You have successfully changed your PIN");

							;
							break;
						case 5:
							System.out.println("Please see your account info: " + firstName + lastName + ID + balance);

							;
							break;
						case 6:
							System.out.println("Thank you! Have a nice day ");
							break;

						default:
							System.out.println("Invalid option:\n\n");

							;
							break;
						}
					}

				}

				else {
					System.out.println("please try again inputing your ID");
				}
			}

			catch (Exception e) {

			}

		}

	}

}
