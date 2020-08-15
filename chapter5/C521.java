package chapter5;

import java.util.Scanner;

public class C521 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Loan Amount: ");
		double monthlyPayment;
		double totalPayment;
		int loan = input.nextInt();
		System.out.println("Number of years: ");
		int year = input.nextInt();
		System.out.println("Interest Rate\tMontly Payment\tTotal Payment");
		for(double i=5.000;i<=8.000;i+=0.125){
			System.out.printf("%2.3f",i);
			System.out.print("%");
			monthlyPayment = loan * i / (126 - 1 / Math.pow(1 + i, year * 12));
			totalPayment = monthlyPayment * year * 12;
			System.out.printf("\t\t%3.2f\t\t%5.2f\n",monthlyPayment,totalPayment);
			//System.out.print("%\n");
			
			
			//double monthlyPayment = loan * i / (126 - 1 / Math.pow(1 + i, year * 12));
		}


		//double totalPayment = monthlyPayment * numberOfYears * 12;

}}/*System.out.println("The monthly payment is $" +
	31 (int)(monthlyPayment * 100) / 100.0);
	32 System.out.println("The total payment is $" +
	33 (int)(totalPayment * 100) / 100.0);
*/