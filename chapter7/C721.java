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
		int[] temp = new int[slot];
		for (int i = drop; i > 0; i--) {
			temp = (randomGenerator(slot));
			printWay(temp);
			slots[findSlot(temp) - 1]++;
		}
		printSlots(slots);
	}

	public static void printSlots(int[] slots) {
		int max = slots[0];
		int maxIndex=0;
		for (int i = 0; i < slots.length; i++) {
			if(max<slots[i]) {
				max=slots[i];
				maxIndex=i;
			}
		}
		//index-1 kadar boþluk sonra O sonra ln max-1 kadar bu iþlem 
		while (max > 0) {
			System.out.println();
			for (int j = 0; j < slots.length; j++) {
				if (slots[j] >= max) {
					System.out.print("O");
				}
				else
					System.out.print(" ");
			}
			max--;
		}
		System.out.println();
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

	}

	public static int findSlot(int[] randomGenerator) {
		int countRight = 0;
		for (int i = 0; i < randomGenerator.length; i++) {
			if (randomGenerator[i] == 1) {
				countRight++;
			}

		}

		return countRight;
	}

	private static int[] randomGenerator(int slot) {
		int result;
		int[] array = new int[slot - 1];
		for (int i = 0; i < slot - 1; i++) {
			result = (int) (Math.random() * 2);
			// 0's are left and 1's are right
			array[i] = result;

		}
		return array;
	}

}
