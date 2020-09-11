package chapter7;

import java.util.Scanner;

/*Is Unique: Implement an algorithm to determine if a string has all unique characters. 
 * Inar -> true
 * Los Angeles -> false (ee) 
 */
/* Çözüm: bütün harfleri içeren bir array oluþtur.
 * girdinin harflerine göre bu arrayin elemanlarýný arttýr
 * eðer 1den fazla olan varsa false döndür
 */
public class InterviewQuestion_IsUnique {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an string: ");
		String inp = input.nextLine();
		unique(inp);

	}

	private static void unique(String inp) {
		int[] letters = new int[26];
		for (int i = 0; i < inp.length(); i++) {
			letters[inp.charAt(i) - 'a']++;
		}
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] > 1) {
				System.out.println("input is not unique");
				System.exit(0);;
			}

		}
		System.out.println("input is unique");
	}
}
