package chapter9.Listing910;

import chapter9.Listing908.CircleWithPrivateDataFields;

public class TestPassObject {
	public static void main(String[] args) {
		
		CircleWithPrivateDataFields myCircle=
				new CircleWithPrivateDataFields(1);
		int n=5;
		printAreas(myCircle,n);
		
		System.out.println("\n"+"Radius is  "+myCircle.getRadius());
		System.out.println("n is "+n);
	}

	private static void printAreas(CircleWithPrivateDataFields c, int n) {
		System.out.println("Radius \t\tArea");
		
		while(n>=1){
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.setRadius(c.getRadius()+1);
			n--;
		}
		
	}
}
