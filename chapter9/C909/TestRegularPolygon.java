package chapter9.C909;

public class TestRegularPolygon {
public static void main(String[] args) {
	RegularPolygon pol1 = new RegularPolygon();
	RegularPolygon pol2 = new RegularPolygon(6,4);
	RegularPolygon pol3 = new RegularPolygon(10,4,5.6,7.8);
	
	System.out.println("pol1 perimeter is: "+pol1.getPerimeter()
	+" area is: "+pol1.getArea());
	System.out.println("pol2 perimeter is: "+pol2.getPerimeter()
	+" area is: "+pol2.getArea());
	System.out.println("pol3 perimeter is: "+pol3.getPerimeter()
	+" area is: "+pol3.getArea());
}
}
