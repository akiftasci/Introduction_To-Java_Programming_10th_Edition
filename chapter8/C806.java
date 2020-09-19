package chapter8;

import java.util.Scanner;

public class C806 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter matrix1: ");
		double [] [] matrix1= new double[3][3];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				matrix1[i][j]=input.nextDouble();
			}
		}
		System.out.println("Enter matrix2: ");
		double [] [] matrix2= new double[3][3];
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2.length; j++) {
				matrix2[i][j]=input.nextDouble();
			}
		}
		double[][] multiplication = multiplication(matrix1, matrix2);
		displayAll(matrix1, matrix2, multiplication);
	}
	
	private static double[][] multiplication(double[][] matrix1, double[][] matrix2) {
		double[][] sum = new double[3][3];
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				for (int k = 0; k < sum.length; k++) {
					sum[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return sum;
}
	private static void displayAll(double[][] matrix1, double[][] matrix2, double[][] sum) {
		System.out.println("The matrices are added as follows");
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[0].length; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.print("\t");
			System.out.print((i == 1) ? "X " : "");
			System.out.print("\t");
			for (int j = 0; j < sum[0].length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.print("\t");
			System.out.print((i == 1) ? "=" : "");
			System.out.print("\t");
			for (int j = 0; j < sum[0].length; j++) {
				System.out.printf("%3.1f  ", sum[i][j]);
			}
			System.out.println();
		}
	}
}
