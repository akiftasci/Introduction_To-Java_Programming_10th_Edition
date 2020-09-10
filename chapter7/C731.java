package chapter7;

import java.util.Scanner;

public class C731 {
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

		int [] lastArray;
		lastArray=merge(list1, list2);
		System.out.print("Merged list is: ");
		for (int i = 0; i < lastArray.length; i++) {
			System.out.print(lastArray[i]+" ");
		}
	}

	public static int[] merge(int[] list1, int[] list2) {
		int[] merged = new int[list1.length + list2.length];
		for (int i = 0; i < list1.length; i++) {
			merged[i] = list1[i];
		}
		int j = 0;
		for (int i = list1.length; i < merged.length; i++) {
			merged[i] = list2[j];
			j++;
		}
		int temp;
		for (int i = 0; i < merged.length - 1; i++) {
			for (int k = 0; k < merged.length - i - 1; k++) {
				if (merged[k] > merged[k + 1]) {
					temp = merged[k];
					merged[k] = merged[k + 1];
					merged[k + 1] = temp;
				}
			}
		}
	
	return merged;}
}
