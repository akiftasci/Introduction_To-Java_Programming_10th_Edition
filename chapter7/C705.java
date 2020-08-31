package chapter7;

import java.util.Scanner;

public class C705 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		System.out.println("Enter ten numbers");
		int num,count=0;

		for (int i = 0; i < 10; i++) {
			num = input.nextInt();
			if (distinctNumber(array, num)){
				array[count]=num;
				count++;
			}

		}
		System.out.println("The number of distinct numbers is " + count);
		System.out.print("The distinct numbers are");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0)
				System.out.print(" " + array[i]);
		}
		System.out.println();
	}

	public static boolean distinctNumber(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i])
				return false;
		}
		return true;
	}
}
