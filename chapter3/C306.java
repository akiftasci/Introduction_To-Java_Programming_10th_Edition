package chapter3;

import java.util.Scanner;

public class C306 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter weight in pounds:");
	double w =0.453*scan.nextDouble();
	System.out.println("Enter feet: ");
	double feet = scan.nextDouble();
	System.out.println("Enter inches: ");
	double inc = scan.nextDouble();
	
	double height = ((feet + inc)/0.0254)*0.0833;
	double bmi = w /(height*height);
	
	if (bmi < 18.5)
		System.out.println("Underweight");
	else if (bmi < 25)
		System.out.println("Normal");
	else if (bmi < 30)
		System.out.println("Overweight");
	else
		System.out.println("Obese");
	System.out.println("BMI is "+ bmi);
	
	
}
}
