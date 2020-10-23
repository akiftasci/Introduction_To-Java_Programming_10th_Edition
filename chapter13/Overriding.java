package chapter13;

public class Overriding {
	public static void main(String[] args) {
		C c = new E();
		c.printName();
	}

}

class C {
	public void printName() {
		System.out.println("I'm a " + getName());
	}
	
	public String getName() {
		return "C";
	}
}

class E extends C {
	public String getName() {
		return "E";
	}
}

