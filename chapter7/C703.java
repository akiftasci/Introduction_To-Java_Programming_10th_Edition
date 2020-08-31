package chapter7;

import java.util.Scanner;

public class C703 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integers between 1 and 100: ");
		int number;
		int count = 0;
		int[] array = new int[0];
		while ((number = input.nextInt()) != 0) {
			array = add2Array(array, number);

		}
		int searchNumber=0;
		for (int i = 0; i < array.length; i++) {
			searchNumber=array[i];
			for (int j = i; j < array.length; j++) {
				if (searchNumber == array[j]) {
					count++;
				
				}
		}
			System.out.println(searchNumber+" occurs "+count+ " times");
			count=0;	
		}
		
	}

	public static int[] add2Array(int[] array, int number) {

		int[] dest = new int[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			dest[i] = array[i];
		}
		dest[array.length] = number;
		return dest;

	}

}
