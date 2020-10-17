package chapter11.C1104;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxElementInArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.print("Enter a sequence of numbers ending wih 0: ");
		Integer number = input.nextInt();
		while (number.intValue() != 0) {
			list.add(number);
			number = input.nextInt();
		}
		System.out.println("The largest number in the input is " + max(list));
	}

	public static Integer max(ArrayList<Integer> list) {
		Integer max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max)
				max = list.get(i);
		}
		return max;
	}
}
