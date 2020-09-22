package chapter9.C911;

public class LinearEquation {
	private double a, b, c, d, e, f;

	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public double getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public double getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public double getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public double getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}

	public boolean isSolvable() {
		if ((a * d) - (b * c) != 0) {
			return true;
		} else {
			return false;
		}
	}

	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}

	public double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}

}
