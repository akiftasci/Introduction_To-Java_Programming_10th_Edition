package chapter7;

import java.util.Scanner;

public class C721 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of balls to drop: ");
		int drop = input.nextInt();
		System.out.println("Enter the number of slots in the bean machine: ");
		int slot = input.nextInt();
		int[] slots = new int[slot];
		randomGenerator(slot, drop);
	}

	private static void printWay(int[] randomGenerator) {

		for (int i = 0; i < randomGenerator.length; i++) {
			if (randomGenerator[i] == 1) {
				System.out.print("R");

			} else {
				System.out.print("L");
			}

		}
		System.out.println();
		findSlot(randomGenerator);
	}

	public static void findSlot(int[] randomGenerator) {
		int countRight = 0;
		int [] slots = new int[10];
		for (int i = 0; i < randomGenerator.length; i++) {
			if (randomGenerator[i] == 1) {
				countRight++;
			}

		}
		slots[countRight-1]++;

	}

	private static void randomGenerator(int slot, int drop) {
		int result ;
		int[] array = new int[slot - 1];
		for (int j = drop; j > 0; j--) {
			for (int i = 0; i < slot - 1; i++) {
				result = (int) (Math.random() * 2);
				// 0's are left and 1's are right
				array[i] = result;

			}
			printWay(array);
		}
	}
}
