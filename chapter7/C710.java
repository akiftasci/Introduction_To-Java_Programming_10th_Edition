package chapter7;

import java.util.Scanner;

public class C710 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		double[] array = new double[10];
		double num;
		for (int i = 0; i < array.length; i++) {
			num = input.nextDouble();
			array[i] = num;
		}
		System.out.println("index of smallest is :" + indexOfSmallestElement(array));
	}

	public static int indexOfSmallestElement(double[] array) {
		double smallest = array[0];
		int min=0;
		for (int j = 0; j < array.length; j++) {

			if (array[j] < smallest) {
				smallest = array[j];
				min =j;
			}
		}

		return min;
	}
}
