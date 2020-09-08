package chapter7;

import java.util.Scanner;

public class C728 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter ten integers: ");
		int x;
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			x=input.nextInt();
			arr[i]=x;
					
		}
		combination(arr);
	}

	private static void combination(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}	
	}

}
