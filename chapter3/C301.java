package chapter3;

import java.util.Scanner;

public class C301 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Enter a, b, c: ");
	double a= scan.nextDouble();
	double b= scan.nextDouble();
	double c= scan.nextDouble();
	
	double x1, x2 , delta;
	
	delta = (b*b)-(4*a*c);
	x1= (-b+Math.sqrt(delta))/2*a;
	x2= (-b-Math.sqrt(delta))/2*a;
	
	if ( delta>0){
		System.out.println("The equation has two roots "+ x1 +"and"+x2);
	}
	
	else if (delta==0){
		System.out.println("The equation has one root:"+x1);
	}
	else {
		System.out.println("The equation has no real roots");
	}
	


	
	
}
}
