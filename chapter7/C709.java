package chapter7;

import java.util.Scanner;

public class C709 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten double values: ");
		double[] array = new double[10];
		double num;
		for (int i = 0; i < array.length; i++) {
			num = input.nextDouble();
			array[i] = num;
		}
		System.out.println("The minimum number is: " + min(array));

	}

	public static double min(double[] array) {
		double min = array[0];
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
				}
			}
		}
		return min;
	}
}
