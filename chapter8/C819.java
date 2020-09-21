package chapter8;

import java.util.Scanner;

public class C819 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and the column");
		int row = input.nextInt();
		int column = input.nextInt();
		int[][] arr = new int[row][column];
		System.out.println("Enter the numbers");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		System.out.println(isConsecutiveFour(arr, column));
	}

	public static boolean isConsecutiveFour(int[][] values, int column) {

		for (int i = 0; i < values.length; i++) {
			int countRow = 0;
			for (int j = 0; j < values.length - 1; j++) {
				if (values[i][j] == values[i][j + 1]) {
					countRow++;
				}
			}
			if (countRow == 3) {
				return true;
			}
		}
		for (int i = 0; i < values.length; i++) {
			int countColumn = 0;
			for (int j = 0; j < column - 1; j++) {
				if (values[j][i] == values[j + 1][i]) {
					countColumn++;
				}
			}
			if (countColumn == 3) {
				return true;
			}
		}
		for (int i = 0; i < values.length - 3; i++) {
			for (int j = 0; j < values[0].length - 3; j++) {
				if ((values[i][j] == values[i + 1][j + 1]) && (values[i + 1][j + 1] == values[i + 2][j + 2])
						&& (values[i + 2][j + 2] == values[i + 3][j + 3])) {
					return true;
				}
			}
		}
		for (int i = 3; i < values.length; i++) {
			for (int j = 0; j < values[0].length - 3; j++) {
				if ((values[i][j] == values[i - 1][j + 1]) && (values[i - 1][j + 1] == values[i - 2][j + 2])
						&& (values[i - 2][j + 2] == values[i - 3][j + 3])) {
					return true;
				}
			}
		}
		return false;
	}
}
/*
 * 0 1 0 3 1 6 1 0 1 6 8 6 0 1 5 6 2 1 8 2 9
 * 
 * 6 5 6 1 1 9 1 1 3 6 1 4 0 7 3 3 3 3 4 0 7
 */