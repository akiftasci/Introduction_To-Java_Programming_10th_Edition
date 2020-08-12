package chapter5;

import java.util.Scanner;

public class C531 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the initial deposit amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter annual percentage yield: ");
		double percentageYield = input.nextDouble();
		System.out.print("Enter maturity period (number of months): ");
		int months = input.nextInt();

		System.out.println("Month  CD Value");
		for (int m = 1; m <= months; m++) {
			amount += amount * (percentageYield / 1200);
			System.out.printf(m+ "\t%4.2f\n",amount);
		}
	}
}
