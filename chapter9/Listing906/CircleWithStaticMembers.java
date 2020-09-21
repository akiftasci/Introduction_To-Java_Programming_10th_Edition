package chapter9.Listing906;

public class CircleWithStaticMembers {
	double radius;
	static int numberOfObjects = 0;

	CircleWithStaticMembers() {
		radius = 1;
		numberOfObjects++;
	}

	CircleWithStaticMembers(double newRadius){
		radius =1;
		numberOfObjects++;
	}
	static int getNumberOfObjects(){
		return numberOfObjects;
	}
	double getArea(){
		return radius*radius*Math.PI;
	}
	
}
