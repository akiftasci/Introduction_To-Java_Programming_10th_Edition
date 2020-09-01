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
		for (int i = 0; i < slots.length; i++) {
			switch (slots[i]) {
			case(0):
				System.out.println("The "+i+"th slot is empty");
			break;
			case (1):
				System.out.println("The "+i+"th slot has 1 coin");
				break;
			case (2):
				System.out.println("The "+i+"th slot has 2 coin");
				break;
			case (3):
				System.out.println("The "+i+"th slot has 3 coin");
				break;
			case (4):
				System.out.println("The "+i+"th slot has 4 coin");
				break;
			case (5):
				System.out.println("The "+i+"th slot has 5 coin");
				break;
			case (6):
				System.out.println("The "+i+"th slot has 6 coin");
				break;
			case (7):
				System.out.println("The "+i+"th slot has 7 coin");
				break;
			case (8):
				System.out.println("The "+i+"th slot has 8 coin");
				break;
			case (9):
				System.out.println("The "+i+"th slot has 9 coin");
				break;
			case (10):
				System.out.println("The "+i+"th slot has 10 coin");
				break;
			}
		}

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
		int[] slots = new int[10];
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
