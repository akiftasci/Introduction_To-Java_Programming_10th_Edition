package chapter10.C1007;

import java.util.Scanner;

public class TestATM {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account[] acc = new Account[10];
		for (int i = 0; i < 10; i++) {
			acc[i] = new Account(i, 100);

		}
		bas:
		while (true) {
			System.out.println("Enter an id: ");
			int userId = input.nextInt();
			if (userId < 0 || userId > 9) {
				System.out.println("Invalid id please enter again");
				continue bas;
			}
			boolean menu = true;
			while (menu) {
				System.out.println("---------------");
				System.out.println("---Main Menu---");
				System.out.println("1: Check Balance");
				System.out.println("2: Withdraw");
				System.out.println("3: Deposit");
				System.out.println("4: Exit");
				System.out.println("Enter a choice: ");
				int choice = input.nextInt();
				switch (choice) {
				case (1):
					System.out.println("The balance is: " + acc[userId].getBalance());
					
					break;
				case (2):
					System.out.println("Enter an amount to withdraw: ");
					double withdraw = input.nextDouble();
					acc[userId].withdraw(withdraw);
					break;
				case (3):
					System.out.println("Enter an amount to deposit: ");
					double deposit = input.nextDouble();
					acc[userId].deposit(deposit);
					break;
				case (4):
					menu = false;
					break;
				}
			}

		}
	}
}
