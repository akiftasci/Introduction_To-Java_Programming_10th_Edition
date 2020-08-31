package chapter7;

import java.util.Scanner;

public class C718 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		double num;
		double[] nos = new double[10];
		for (int i = 0; i < nos.length; i++) {
			num = input.nextDouble();
			nos[i] = num;
		}
		double[] sorted = bubbleSort(nos);
for (int i = 0; i < nos.length; i++) {
	System.out.println(sorted[i]+ " ");
}
	}

	

	public static double[] bubbleSort(double[] nos) {
		for (int i = 0; i < nos.length - 1; i++) {
			for (int j = 0; j < nos.length - i - 1; j++) {
				if (nos[j] > nos[j + 1]) {
					double temp = nos[j];
					nos[j] = nos[j + 1];
					nos[j + 1] = temp;
				}
			}
		}
	return nos;
	}
}