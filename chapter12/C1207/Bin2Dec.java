package chapter12.C1207;

import java.util.Scanner;

public class Bin2Dec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an binary number: ");
		String binaryString = input.nextLine();
		int decimalValue = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			decimalValue = decimalValue * 2 + (binaryString.charAt(i) - 48);
			if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
				throw new NumberFormatException("Not a binary");
			}
		}
		System.out.println(decimalValue);
		
	}
}
