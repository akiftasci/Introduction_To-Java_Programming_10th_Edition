package chapter9.C901;

public class TestRectangle {
	public static void main(String[] args) {

		Rectangle rec1 = new Rectangle(4, 40);
		Rectangle rec2 = new Rectangle(3.5, 35.9);
		System.out.println("The width of rec1 is " + rec1.width + " and the height is " + rec1.height);
		System.out.println("The rec1's area is: " + rec1.getArea() + " and the perimeter is " + rec1.getPerimeter());
		System.out.println("The width of rec2 is " + rec2.width + " and the heigth is " + rec2.height);
		System.out.println("The rec2's area is: " + rec2.getArea() + " and the perimeter is " + rec2.getPerimeter());
	}

}
