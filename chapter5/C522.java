package chapter5;

import java.util.Scanner;

public class C522 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		int years = input.nextInt();
		System.out.print("Annual Interest Rate: ");
		double annualRate = input.nextDouble();
		double monthlyRate = annualRate / 1200;
		double monthlyPayment = loanAmount * monthlyRate / (1 - 1 / Math.pow(1 + monthlyRate, years * 12));
		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
		System.out.printf("Total Payment: %.2f\n", (monthlyPayment * 12) * years);

		double balance = loanAmount, principal, interest;
		System.out.println("Payment#\tInterest\tPrincipal\tBalance");
		for (int i = 1; i <= years * 12; i++) {
			interest = monthlyRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			System.out.printf("%d\t\t%2.2f\t\t%3.2f\t\t%4.2f\n", i, interest, principal, balance);
		}
	}
}
