package chapter2;

import java.util.Scanner;

public class C204 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double KILOGRAMS_PER_POUND = 0.454;	


		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();

	
		double kilograms = pounds * KILOGRAMS_PER_POUND;

		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	}

}
