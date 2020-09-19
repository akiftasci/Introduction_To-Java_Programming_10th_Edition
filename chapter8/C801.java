package chapter8;

import java.util.Scanner;

public class C801 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row:");
		double[][] arr = new double[3][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		for (int ind = 0; ind < 4; ind++) {

			System.out.println("Sum of the elements at column " + ind + " is " + sumColumn(arr, ind));
		}

	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double total = 0;
		for (int i = 0; i <3; i++) {
			total += m[i][columnIndex];
		}
		return total;
	}
}
