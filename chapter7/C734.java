package chapter7;

import java.util.Scanner;

public class C734 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String inp;
		inp = input.nextLine();
		System.out.println(sort(inp));
	}

	public static String sort(String s) {
		char[] letters = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			letters[i] = s.charAt(i);
		}
		char temp;
		for (int j = 0; j < letters.length - 1; j++) {
			for (int i = 0; i < letters.length - j - 1; i++) {
				if ((int) letters[i] > (int) letters[i + 1]) {
					temp = letters[i];
					letters[i] = letters[i + 1];
					letters[i + 1] = temp;
				}
			}
		}
		String total="";
		for (int i = 0; i < letters.length; i++) {
			total+=letters[i];
		}
		return total;
	}
}
