package chapter8;

import java.util.Scanner;

public class C811 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 511:");
		int inp = input.nextInt();
		char[][] done = new char[3][3];
		done=binary(inp);
		for (int i = 0; i < done.length; i++) {
			for (int j = 0; j < done.length; j++) {
				System.out.print(done[i][j]+" ");
				
			}
			System.out.println();
		}
	}

	private static char[][] binary(int inp) {
		int temp = inp;
		int binary = 0;
		int[] arr = new int[9];
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = inp % 2;
			inp = inp / 2;
		}
		char[][] done = new char[3][3];
		done=toMultiArray(arr);
		return done;
	}

	private static char[][] toMultiArray(int[] arr) {
		char[][] multi = new char[3][3];
		int column = 2, row = 2;
		for (int i = 8; i >=0; i--) {
			if (arr[i] == 1) {
				multi[column][row] = 'T';
				row--;
			} else if (arr[i] == 0) {
				multi[column][row] = 'H';
				row--;
			}
			if (row < 0) {
				column--;
				row = 2;
			}
			if (column < 0) {
				break;
			}
		}
		return multi;

	}
}
