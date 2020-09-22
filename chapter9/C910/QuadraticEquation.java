package chapter9.C910;

public class QuadraticEquation {
	private int a = 0;
	private int b = 0;
	private int c = 0;

	QuadraticEquation(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public double getDiscriminant() {
		return Math.pow(b, 2) -(4 * a * c);
	}

	public double getRoot1() {
		if(getDiscriminant()>0){
		return (-b +(Math.sqrt(Math.pow(b,2)-(4*a*c))))/2*a;
		}
		else{
			return 0;
		}
	}

	public double getRoot2() {
		if(getDiscriminant()>0){
		return (-b -(Math.sqrt(Math.pow(b,2)-(4*a*c))))/2*a;
		}
		else{
			return 0;
		}
	}

}
