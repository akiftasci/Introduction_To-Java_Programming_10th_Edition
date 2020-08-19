package chapter6;

import java.util.Scanner;

public class C607 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("The amount invested: ");
	double inv = input.nextDouble();
	System.out.println("Annual interesrt rate: ");
	double interestAnnual = input.nextInt();
	double monthlyInterestRate = interestAnnual/1200;
	
	System.out.println("Years\tFuture Value");
	for (int i=1;i<31;i++){
		System.out.print(i+"\t");
		System.out.printf("%11.2f",futureInvestmentValue(inv, monthlyInterestRate, i));
		System.out.println();
	}
	
}
public static double futureInvestmentValue(double investmentAmount, 
double monthlyRate, int years){
	
		double futureInvestmentValueAns = 
			investmentAmount * Math.pow(1 + monthlyRate, years * 12);
		
		return futureInvestmentValueAns;
		
	}}
	

