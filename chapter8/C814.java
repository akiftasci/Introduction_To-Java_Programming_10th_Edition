package chapter8;

import java.util.Scanner;

public class C814 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size for the matrix: ");
		int size = input.nextInt();
		int[][] arr = new int[size][size];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (int) (Math.random() * 2);
			}
		}
		printArray(arr, size);
		checkRow(arr, size);
		checkColumn(arr, size);
	}

	private static void printArray(int[][] arr, int size) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void checkColumn(int[][] arr, int size) {
		int indexOnes = 0, indexZeros = 0;

		for (int i = 0; i < arr.length; i++) {
			int countOnes = 0;
			int countZeros = 0;
			for (int j = 0; j < size; j++) {
				if (arr[j][i] == 1) {
					countOnes++;
				} else {
					countZeros++;
				}
				if (countOnes == size) {
					indexOnes = i;
				}
				if (countZeros == size) {
					indexZeros = i;
				}
			}

		}
		System.out.println("All 0's on column " + indexZeros);
		System.out.println("All 1's on column " + indexOnes);

	}

	private static void checkRow(int[][] arr, int size) {

		int indexOnes = 0, indexZeros = 0;

		for (int i = 0; i < arr.length; i++) {
			int countOnes = 0;
			int countZeros = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 1) {
					countOnes++;
				} else {
					countZeros++;
				}
				if (countOnes == size) {
					indexOnes = i;
				}
				if (countZeros == size) {
					indexZeros = i;
				}
			}

		}
		System.out.println("All 0's on row " + indexZeros);
		System.out.println("All 1's on row " + indexOnes);
	}

}
