package chapter7;

import java.util.Scanner;

public class C735 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = { "ferrari" };

		while (true) {
			System.out.print("Enter a letter in word ");
			starsArray(words);
			
			char inp;
			inp = input.next();
			for (int i = 0; i < words.length; i++) {
				if (words[i] == inp) {

				}
			}
		}

	}

	private static void starsArray(String[] words) {
		String word = words[0];
		char[] stars = new char[word.length()];
		for (int i = 0; i < stars.length; i++) {
			stars[i] = '*';
		}
		for (int i = 0; i < stars.length; i++) {
			System.out.print(stars[i]);
		}
		System.out.print(" >>");
		System.out.println();

	}
}
