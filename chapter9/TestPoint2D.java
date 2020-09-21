package chapter9;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.Scanner;


public class TestPoint2D {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter point1's x and y");
	int x1 = input.nextInt();
	int y1 = input.nextInt();
	
	System.out.println("Enter point2's x and y");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	
	Point p1 = new Point(x1,y1);
	//Point2D p2 = new Point2D(x2,y2);
	System.out.println("p1 is "+p1.toString());
//	System.out.println("p2 is "+p2.toString());
//	System.out.println("The distance between p1 and p2 is "+p1.distance(p2));
}
}
