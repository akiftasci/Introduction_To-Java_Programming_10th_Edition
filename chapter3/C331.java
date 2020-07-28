package chapter3;

import java.util.Scanner;

public class C331 {
	public static void main(String[] args) {
		System.out.println("Enter the exchange rate from dollars to RMB: ");
		Scanner input = new Scanner(System.in);
		double exchange = input.nextDouble();
		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
		int convert = input.nextInt();
		double amount;
		switch (convert) {
		case 0:
			System.out.println("Enter the dollar amount: ");
			amount = input.nextDouble();
			System.out.println("$" + amount + " is " + (amount * exchange) + " yuan");
			break;
		case 1:
			System.out.println("Enter the RMB maount: ");
			amount = input.nextDouble();
			System.out.println(amount + " yuan is $" + ((int) ((amount * 100) / exchange)) / 100.0);
			break;
		default: System.out.println("Incorrect input");
		}
	}
}
