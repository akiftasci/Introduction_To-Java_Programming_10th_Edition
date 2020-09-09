package chapter7;

import java.util.Scanner;

public class C727 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter list1:");
		int no1 = input.nextInt();
		int[] list1 = new int[no1];
		for (int i = 0; i < list1.length; i++) {
			int inp = input.nextInt();
			list1[i] = inp;
		}

		System.out.println("Enter list2:");
		int no2 = input.nextInt();
		int[] list2 = new int[no2];
		for (int i = 0; i < list2.length; i++) {
			int inp2 = input.nextInt();
			list2[i] = inp2;
		}

		System.out.println(equals(list1, list2));

	}

	public static boolean equals(int[] list1, int[] list2) {

		if (list1.length != list2.length) {
			return false;
		}
		int[] checker = new int[100];
		int temp;
		
		for (int i = 0; i < list1.length; i++) {
			temp = list1[i];
			checker[temp - 1]++;
		}
		for (int i = 0; i < list2.length; i++) {
			temp = list2[i];
			checker[temp - 1]--;
		}
		for (int i = 0; i < checker.length; i++) {
			if (checker[i] != 0) {
				return false;
			}

		}
		return true;
	}

}
