package chapter6;

import java.util.Scanner;

public class C621 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String no = input.nextLine();
		String kelime = no.toUpperCase();
		for (int i = 0; i < kelime.length(); i++) {
			if (Character.isLetter(kelime.charAt(i))) {
				System.out.print(getNumber(kelime.charAt(i)));

			} else {
				System.out.print(kelime.charAt(i));
			}
			
		}

	}

	public static int getNumber(char uppercaseLetter) {
		int asci = (int) uppercaseLetter;
		if (65 >= asci && asci < 68) {
			return 1;
		} else if (68 >= asci && asci < 71) {
			return 2;
		} else if (71 >= asci && asci < 74) {
			return 3;
		} else if (74 >= asci && asci < 77) {
			return 4;
		} else if (77 >= asci && asci < 80) {
			return 5;
		} else if (80 >= asci && asci < 83) {
			return 6;
		} else if (83 >= asci && asci < 86) {
			return 7;
		} else if (86 >= asci && asci < 89) {
			return 8;
		} else if (89 >= asci && asci < 92) {
			return 9;
		}
		return 0;

	}

}
