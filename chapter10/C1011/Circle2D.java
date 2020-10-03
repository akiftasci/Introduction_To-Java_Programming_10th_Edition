package chapter10.C1011;

public class Circle2D {
	private double x;
	private double y;
	private double radius;
	
	Circle2D(){
		x=0;
		y=0;
		radius=1;
	}
	Circle2D(double x,double y, double radius){
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public double getArea(){
		return Math.PI*radius*radius;
	}
	public double getPerimeter(){
		return 2*Math.PI*radius;
	}
	public boolean contains(double x, double y){
		double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));

		if (distance <= radius) {
			return true;
		}

		return false;
	}
	public boolean contains(Circle2D circle){
		double distance = (Math.pow(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2), 0.5));

		if (distance <= Math.abs(circle.getRadius() - radius)) {
			return true;
		}

		return false;
	}
	public boolean overlaps(Circle2D circle){
		double distance = Math.pow(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2), 0.5);

		if (distance <= (circle.getRadius() + radius)) {
			return true;
		}

		return false;
	}
	
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
	

}
