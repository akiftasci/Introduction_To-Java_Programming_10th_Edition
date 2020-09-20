package chapter8;

import java.util.Scanner;

public class C813 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of rows and columns of the array: ");
	int row = input.nextInt();
	int column = input.nextInt();
	double[][] arr = new double[row][column];
	System.out.println("Enter the array:");
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < column; j++) {
			arr[i][j]=input.nextDouble();
		}
	}
	int[] index = new int[2];
	index=findLargestLocation(arr,column);
	System.out.println(index[0]+","+index[1]);
}

private static int[] findLargestLocation(double[][] arr,int column) {
	double max=0;
	int indexRow=0,indexColumn=0;
	int[] index = new int[2];
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < column; j++) {
			if(arr[i][j]>max){
				indexRow=i;
				indexColumn=j;
			}
		}
	}
	index[0]=indexRow;
	index[1]=indexColumn;
	return index;
}
}
