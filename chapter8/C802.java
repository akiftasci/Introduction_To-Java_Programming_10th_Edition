package chapter8;

import java.util.Scanner;


public class C802 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4by4 matrix row by row");
		double[][] arr = new double[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = input.nextDouble();
			}
		}
		System.out.println("Sum of the elements in the major diagnol is:"+sumMajorDiagonal(arr));
	}

	public static double sumMajorDiagonal(double [][] m){
		//0,0 1,1 2,2 3,3
		double total=0;
		for (int i = 0; i < m.length; i++) {
			total+=m[i][i];
		}
		return total;
	}
}
