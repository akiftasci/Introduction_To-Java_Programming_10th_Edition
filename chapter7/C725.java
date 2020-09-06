package chapter7;

import java.util.Scanner;

public class C725 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your a, b and c");
	double  [] abc = new double[3];
	int inp;
	for(int i=0;i<abc.length;i++){
		inp=input.nextInt();
		abc[i]=inp;
	}
double x1, x2 , delta;
	
	delta = (abc[1]*abc[1])-(4*abc[0]*abc[2]);
	x1= (-abc[1]+Math.sqrt(delta))/2*abc[0];
	x2= (-abc[1]-Math.sqrt(delta))/2*abc[0];
	double [] roots = new double[2];
	roots[0]=x1;
	roots[1]=x2;
	
	System.out.println(solveQuadratic(abc, roots));
	
}
public static int solveQuadratic(double[] eqn, double[] roots){
	
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
