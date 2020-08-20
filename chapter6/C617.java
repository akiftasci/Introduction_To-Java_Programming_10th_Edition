package chapter6;

import java.util.Scanner;

public class C617 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a n value: ");
		int n = input.nextInt();
		printMatrix(n);

	}

	public static void printMatrix(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print((int)(Math.random()*2 )+" ");
				// int rand = (int)(Math.random() * range) + min;
			}
			System.out.println();
		}
	}
}
