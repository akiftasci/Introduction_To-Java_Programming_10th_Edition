package chapter9.C910;

import java.util.Scanner;

public class TestQuadraticEquation {
public static void main(String[] args) {
	System.out.println("Enter values for a , b, c");
	Scanner input = new Scanner(System.in);
	int a= input.nextInt();
	int b= input.nextInt();
	int c=input.nextInt();
	QuadraticEquation equ = new QuadraticEquation(a, b, c);
	double dis = equ.getDiscriminant();
	System.out.println("The disciriminant is: "+dis);
	if(dis>0){
		System.out.println("Root1 is: "+equ.getRoot1()+" root2 is: "+equ.getRoot2());
	}
	if(dis==0){
		System.out.println("Root is: "+equ.getRoot1());
		
	}
	if(dis<0){
		System.out.println("The equation has no roots");
	}
	
}
}
