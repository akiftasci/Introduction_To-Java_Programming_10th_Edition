package chapter8;

import java.util.Scanner;

public class C821 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of cities:");
	int cities = input.nextInt();
	double[][] arr = new double[cities][2];
	System.out.println("Enter the coordinates of the cities");
	for (int i = 0; i <cities; i++) {
		arr[i][0]=input.nextDouble();
		arr[i][1]=input.nextDouble();
	}
	centralCity(arr,cities);
}

public static void centralCity(double[][] arr, int cities) {
	double minDistance=0,sum=0;
	int index=0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			sum+=calculateDistance(arr[i],arr[j]);
		}
		if (sum > minDistance) {
			minDistance = sum;
			index = i;
		}
	}
	System.out.println("The central city is at (" + arr[index][0] + ", " + arr[index][1] + ")");
	System.out.printf("The total distance to all other cities is %.2f", minDistance);
}

private static double calculateDistance(double[] ds, double[] ds2) {
	double distance = Math.sqrt((ds[0] - ds2[0]) * (ds[0] - ds2[0]) + (ds[1] - ds2[1]) * (ds[1] - ds2[1]));
	return distance;
	
}
}
