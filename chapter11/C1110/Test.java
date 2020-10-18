package chapter11.C1110;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MyStack stack = new MyStack();
		System.out.print("Enter five strings: ");
		for (int i = 0; i < 5; i++) {
			stack.push(input.next());	
		}
		System.out.println("Stack: " + stack.toString());
	}
}
