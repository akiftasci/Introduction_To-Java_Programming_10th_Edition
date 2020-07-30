package chapter4;

import java.util.Scanner;

public class C405 {
public static void main(String[] args) {
	System.out.println("Enter the number of sides: ");
	Scanner input = new Scanner(System.in);
	double sides = input.nextDouble();
	System.out.println("Enter the side: ");
	double side = input.nextDouble();
	
	double area = (sides*Math.pow(side, 2))/(4*(Math.tan(Math.PI/sides)));
	
	
	System.out.println("The area of the polygon is "+area);
	
}
}
