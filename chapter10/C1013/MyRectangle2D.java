package chapter10.C1013;

public class MyRectangle2D {
	private double x;
	private double y;
	private double width;
	private double height;
	
	MyRectangle2D(){
		x=0;
		y=0;
		width=1;
		height=1;
	}
	MyRectangle2D(double x, double y, double width, double height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		
	}
	public double getArea(){
		return width*height;
	}
	public double getPerimeter(){
		return 2*width*height;
	}
	public boolean contains(double x, double y){
		double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
		if (distance <= width/2 && distance <= height/2) {
			return true;
		}
		return false;
	}
/*	public boolean contains(MyRectangle2D r){
		double distance = (Math.pow(Math.pow(r.getX() - x, 2) + Math.pow(r.getY() - y, 2), 0.5));
		if (distance <= Math.abs(r.getWidth() - )) {
			return true;
		}
		return false;
	}*/
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
