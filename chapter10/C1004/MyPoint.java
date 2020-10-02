package chapter10.C1004;

public class MyPoint {
	private int x;
	private int y;
	
	MyPoint(){
		x=0;
		y=0;
	}
	MyPoint(int x,int y){
		this.x=x;
		this.y=y;
	}
	public double distance(MyPoint a){
		return Math.sqrt((x - a.x) * (x - a.x) + (y - a.y) * (y - a.y));
	}
	public double distance(double x, double y) {
		return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
}
