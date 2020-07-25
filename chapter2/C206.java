package chapter2;

import java.util.Scanner;

public class C206 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);		

	System.out.print("Enter a number between 0 and 1000: ");
	int number = input.nextInt();

	int lessThan10 = number % 10;		// Extract the digit less than 10
	number /= 10;							// Remove the extracted digit
	int tens = number % 10;				// Extract the digit between 10 to 99
	number /= 10;							// Remove the extracted digit
	int hundreds = number % 10;		// Extract the digit between 100 to 999
	number /= 10;							// Remove the extracted digit
	int sum = hundreds + tens + lessThan10;	

	System.out.println("The sum of the digits is " + sum);
}
}
