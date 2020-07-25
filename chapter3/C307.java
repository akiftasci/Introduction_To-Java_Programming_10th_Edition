package chapter3;

import java.util.Scanner;

public class C307 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print(
			"Enter an amount in double, for example 11.56: ");
		double amount = scan.nextDouble();

		int remainingAmount = (int)(amount * 100);
		int numberOfDollars = remainingAmount / 100;
		remainingAmount %= 100;

		int numberOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;

		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;

		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;

		int numberOfPennies = remainingAmount;
		System.out.println("Your amount " + amount + " consists of");
		if (numberOfDollars > 1) {
		    System.out.println (" " + numberOfDollars + "dollars");
		} else if (numberOfDollars == 1) {
		    System.out.println (" " + numberOfDollars + "dollar");
		}
		if (numberOfQuarters > 1) {
		    System.out.println (" " + numberOfQuarters + "Quarters");
		} else if (numberOfQuarters == 1) {
		    System.out.println (" " + numberOfDollars + "Quarter");
		}
		if (numberOfDimes > 1) {
		    System.out.println (" " + numberOfDimes + "Dimes");
		} else if (numberOfDimes == 1) {
		    System.out.println (" " + numberOfDimes + "Dime");
		}
		if (numberOfNickels > 1) {
		    System.out.println (" " + numberOfNickels + "Nickels");
		} else if (numberOfNickels == 1) {
		    System.out.println (" " + numberOfNickels + "Nickel");
		}
		if (numberOfPennies > 1) {
		    System.out.println (" " + numberOfPennies + "Pennies");
		} else if (numberOfPennies == 1) {
		    System.out.println (" " + numberOfPennies + "Pennie");
		}
		
}

}
