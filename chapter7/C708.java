package chapter7;

import java.util.Scanner;

public class C708 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println(	"Enter ten values: ");
	double [] array = new double[10];
	for (int i = 0; i < 10; i++) {
		array[i] = input.nextDouble();
		
	}
	System.out.println(average(array));
	}

public static int average( int[] array){
	int average,total=0;
	for (int i = 0; i < array.length; i++) {
		total =total+ array[i]; 
	}
	average = total/array.length;
	return average;
}
public static double average (double [] array){
	double average,total=0;
	for (int i = 0; i < array.length; i++) {
		total =total+ array[i]; 
	}
	average = total/array.length;
	return average;
}
}
