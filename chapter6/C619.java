package chapter6;

import java.util.Scanner;

public class C619 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the sides of triangle: ");
	int side1 = input.nextInt();
	int side2 = input.nextInt();
	int side3 = input.nextInt();
	System.out.println("The input is "+isValid(side1,side2,side3));
	System.out.println("The area is "+area(side1,side2,side3));
	
	
}
public static boolean isValid(double side1,double side2, double side3){
	if(side1+side2>side3){
		return true;
	}
	else{
		return false;
	}
}
public static double area(double side1, double side2, double side3){
	
	double s = (side1 + side2 + side3) / 2;
	double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
	return area;
}
}
