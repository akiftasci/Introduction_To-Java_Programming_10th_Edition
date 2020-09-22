package chapter9.C912;

import java.util.Scanner;

import chapter9.C911.LinearEquation;

public class TestC912 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();5
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		double a = y1 - y2;
		double b = x2 - x1;
		double c = y3 - y4;
		double d = x4 - x3;
		double e = (y1 - y2) * x1 - y1 * (x1 - x2);
		double f = x3 * (y3 - y4) - y3 * (x3 - x4);

		LinearEquation k = new LinearEquation(a, b, c, d, e, f);
		if (!k.isSolvable()) {
			System.out.println("The equation has no solution");
		} else {
			System.out.println("X is: " + k.getX() + "\nY is: " + k.getY());
		}
	}

}
