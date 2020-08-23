package chapter6;

import java.util.Scanner;

public class C636 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of sides: ");
		int noOfSides = input.nextInt();
		System.out.println("Enter the side: ");
		double side = input.nextDouble();
		
		System.out.printf("The area of the pentagon is %4.2f",area(noOfSides,side));
	}
	public static double area (int n,double side){
		double area= (n*side*side)/(4*(Math.tan(Math.PI/n)));
		return area;
		
	}
}
