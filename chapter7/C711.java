package chapter7;

import java.util.Scanner;

public class C711 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");
		double[] array = new double[10];
		double num;
		for (int i = 0; i < array.length; i++) {
			num = input.nextDouble();
			array[i] = num;
		}
		System.out.println("The mean is: "+ mean(array));
		System.out.println("The deviation is: "+ deviation(array));
		
	}
	public static double deviation(double[] x){
		double total=0;
		for (int i = 0; i < x.length; i++) {
			total=total+Math.pow((x[i]-mean(x)), 2);
			
		}
		total=Math.sqrt(total/(x.length-1));
		return total;
		
		
	}
	public static double mean(double[] x){
		double total=0;
		for (int i = 0; i < x.length; i++) {
			total= total+x[i];
		}
		return total/x.length;
	}
}
