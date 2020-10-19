package chapter12.C1205;

public class Test {
	public static void main(String[] args) {
		try {
			Triangle t = new Triangle(1, 2, 3);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
