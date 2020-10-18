package chapter12.C1203;

import java.util.Scanner;

public class C1203 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			int rand = (int) (Math.random() * 10);
			arr[i] = rand;
		}
		try{
		System.out.println("Enter an index:");
		int inp = input.nextInt();
		System.out.println(arr[inp]);
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("Array oyt of bounds");
		}
	}
}
