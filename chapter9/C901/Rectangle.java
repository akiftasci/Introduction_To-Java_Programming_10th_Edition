package chapter9.C901;

public class Rectangle {
double width=1;
double height=1;

Rectangle(double newWidth, double newHeight){
	width= newWidth;
	height = newHeight;
}
public double getArea(){
	return width *height;
}
public double getPerimeter(){
	return 2*(width+height);
}
}
