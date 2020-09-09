package chapter7;

import java.util.Scanner;

public class C730 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of values: ");
		int number = input.nextInt();
		int[] arr = new int[number];
		System.out.println("Enter the values: ");
		int value;
		for (int i = 0; i < arr.length; i++) {
			value = input.nextInt();
			arr[i] = value;
		}
		if(consecutive(arr)){
			System.out.println("The list has consecutive fours.");
		} else {
			System.out.println("The list has no consecutive fours.");
		
		}
	}

	private static boolean consecutive(int[] arr) {
		int temp;
		int count = 0;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		int[] tempArr = new int[max];
		for (int j = 0; j < arr.length; j++) {
			temp = arr[j];
			tempArr[temp - 1]++;
		}
		for (int j = 0; j < tempArr.length; j++) {
			if (tempArr[j] == 4) {
				return true;	
			}

		}
		return false;
	}

}
