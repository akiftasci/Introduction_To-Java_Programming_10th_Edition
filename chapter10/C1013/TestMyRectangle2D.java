package chapter10.C1013;

public class TestMyRectangle2D {
	public static void main(String[] args) {
		// Create a MyRectangle2D object
		MyRectangle2D r1 = new MyRectangle2D(2.0, 2.0, 5.5, 4.9);

		// Display results
		System.out.println("\nRectangle:");
		System.out.println("Area: " + r1.getArea());
		System.out.println("Perimeter: " + r1.getPerimeter());
		System.out.println((r1.contains(3, 3) ? "Contains" : "Does not contain") + 
			" the point (3, 3).");
		
	}
}
