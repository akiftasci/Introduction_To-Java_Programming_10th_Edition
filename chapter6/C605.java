package chapter6;

import java.util.Scanner;

public class C605 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int no1 = input.nextInt();
		int no2 = input.nextInt();
		int no3 = input.nextInt();
		displaySortedNumbers(no1, no2, no3);

	}

	public static void displaySortedNumbers(int num1, int num2, int num3) {
		int temp = 0;
		if (num2 < num1 && num2 < num3) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		} else if (num3 < num1 && num3 < num2) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}

		System.out.println(num1 + " " + num2 + " " + num3);
	}
}