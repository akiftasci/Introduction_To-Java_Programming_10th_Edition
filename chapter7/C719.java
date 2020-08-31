package chapter7;

import java.util.Scanner;

public class C719 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter list:");
		int no = input.nextInt();
		int[] array = new int[no];
		int num;
		for (int i = 0; i < array.length; i++) {
			num = input.nextInt();
			array[i] = num;
		}
		System.out.println("The list is ordered " + isSorted(array));
	}

	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] > list[i + 1]) {
				return false;
			}
		}
			return false;
		
	}
}