package chapter3;

import java.util.Scanner;

public class C303 {
	public static void main(String[] args) {
		System.out.println("Enter a,b,c,d,e,f: ");
		
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double d = scan.nextDouble();
		double e = scan.nextDouble();
		double f = scan.nextDouble();
		
		if(a*d-b*c==0){
			System.out.println("The equation has no solution.");
			
		}
		else{
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			System.out.println("x is " + x + " and y is " + y);
		}
	}

}


