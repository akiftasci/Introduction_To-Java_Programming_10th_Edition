package chapter4;

import java.util.Scanner;

public class C401 {
	public static void main(String[] args) {
		System.out.println("Enter the length from the center to a vertex: ");
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		double s = 2*r*(Math.sin(Math.PI/5));
		double area = (5*s*s)/(4*(Math.tan(Math.PI/5)));
		System.out.println("The area of the pentagon is "+ area);
	}

}
