package chapter8;

import java.util.Scanner;

public class C805 {
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
	double[][] total=addMatrix(matrix1,matrix2);
	print(total,matrix1,matrix2);
}
private static void print(double[][] total, double[][] matrix1, double[][] matrix2) {
	System.out.println("The matrices are added as follows");
	for (int i = 0; i < total.length; i++) {
		for (int j = 0; j < total[0].length; j++) {
			System.out.print(matrix1[i][j] + " ");
		}
		System.out.print("\t");
		System.out.print((i == 1) ? "+ " : "");
		System.out.print("\t");
		for (int j = 0; j < total[0].length; j++) {
			System.out.print(matrix2[i][j] + " ");
		}
		System.out.print("\t");
		System.out.print((i == 1) ? "=" : "");
		System.out.print("\t");
		for (int j = 0; j < total[0].length; j++) {
			System.out.print(total[i][j] + " ");
		}
		System.out.println();
	}
		
	
	
}
public static double [][] addMatrix(double [][] a, double[][] b){
	double[][] added = new double[3][3];
	for (int i = 0; i < added.length; i++) {
		for (int j = 0; j < added.length; j++) {
			added[i][j]=a[i][j]+b[i][j];
		}
	}
	return added;
}
}
