package chapter13.C1302;

import java.util.ArrayList;

public class ShuffleArrayList {
	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(465);
		list.add(24);
		list.add(633);
		list.add(4.5);
		System.out.println(list.toString());
		shuffle(list);
		System.out.println(list.toString());
	}

	public static void shuffle(ArrayList<Number> list) {
		java.util.Collections.shuffle(list);
	}
}
