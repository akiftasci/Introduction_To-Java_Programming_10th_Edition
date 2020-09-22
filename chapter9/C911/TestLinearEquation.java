package chapter9.C911;

import java.util.Scanner;

public class TestLinearEquation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values for a b c d e f ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		LinearEquation equ1 = new LinearEquation(a, b, c, d, e, f);
		boolean cek = equ1.isSolvable();
		if (cek == false) {
			System.out.println("The equation has no solution");

		} else {
			System.out.println("X: " + equ1.getX() + " Y: " + equ1.getY());
		}
	}
}
