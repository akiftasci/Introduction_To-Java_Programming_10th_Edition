package chapter7;

import java.util.Scanner;

public class InterviewQuestion_RotateArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter k:");
		int k = input.nextInt();

		int[] arr = new int[7];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		rotate(arr, k);
	}

	private static void rotate(int[] arr, int k) {
		for (int j = 0; j < k; j++) {
			int last = arr[arr.length - 1];
			for (int i = arr.length-1; i >0; i--) {
				arr[i] = arr[i - 1];
			}
			 arr[0]=last;
		}
	}

}
