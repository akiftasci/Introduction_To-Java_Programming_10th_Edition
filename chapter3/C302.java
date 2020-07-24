package chapter3;

import java.util.Scanner;

public class C302 {
public static void main(String[] args) {
	int a=(int)(Math.random()*10);
	int b=(int)(Math.random()*10);
	int c=(int)(Math.random()*10);
	
	System.out.println("Enter the sum of three integers:");
	System.out.println(a+"+"+b+"+"+c+"=");
	Scanner scan = new Scanner(System.in);
	
	int d = scan.nextInt();
	int e= a+b+c;
	if(d==e){
		System.out.println("Your answer is correct");
		
	}
	else if (d!=e){
		System.out.println("Your answer is wrong");
	}
}
}
