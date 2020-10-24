package chapter13.C1303;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(465);
		list.add(24);
		list.add(633);
		list.add(4);
		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println(list.toString());
	}
	
}
