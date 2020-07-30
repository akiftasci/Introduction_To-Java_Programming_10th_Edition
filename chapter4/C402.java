package chapter4;

import java.util.Scanner;

public class C402 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter point 1 (latitude and longitude) in degrees:");
		String point1 = input.nextLine();
		System.out.println("Enter point 2 (latitude and longitude) in degrees:");
		String point2 = input.nextLine();

		int m = point1.indexOf(',');
		double x1 = Double.parseDouble(point1.substring(0, m ));
		double y1 = Double.parseDouble(point1.substring(m+1 ));
		System.out.println("x1,y1: "+x1+" "+y1);

		int k = point2.indexOf(',');
		double x2 = Double.parseDouble(point2.substring(0, k));
		double y2 = Double.parseDouble(point2.substring(k+1 ));
		System.out.println("x2,y2: "+x2+" "+y2);
		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);

		double distance = (6371.01* Math.acos(Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
		System.out.println("The distance between the two points is " + distance);
	}
}
