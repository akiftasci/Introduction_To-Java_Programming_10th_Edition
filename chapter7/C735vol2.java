package chapter7;
/*(Game: hangman) Write a hangman game that randomly generates a word and
prompts the user to guess one letter at a time, as shown in the sample run. Each
letter in the word is displayed as an asterisk. When the user makes a correct
guess, the actual letter is then displayed. When the user finishes a word, display
the number of misses and ask the user whether to continue to play with another
word. Declare an array to store words, as follows:
// Add any words you wish in this array
String[] words = {"write", "that", ...};

(Guess) Enter a letter in word ******* > p
(Guess) Enter a letter in word p****** > r
(Guess) Enter a letter in word pr**r** > p
p is already in the word
(Guess) Enter a letter in word pr**r** > o
(Guess) Enter a letter in word pro*r** > g
(Guess) Enter a letter in word progr** > n
n is not in the word
(Guess) Enter a letter in word progr** > m
(Guess) Enter a letter in word progr*m > a
The word is program. You missed 1 time
Do you want to guess another word? Enter y or n> */

import java.util.Arrays;
import java.util.Scanner;

//elimizde bir kelime var ve bunu harf harf(char) bölüyoruz sonra bir array oluþturuyoruz bunla
//Bu kelimenin uzunluðunda yýldýzlý bir array var ve doðru harf girdiðimde yýldýz harfe dönüþecek
//
public class C735vol2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = { "ferrari" };
		String len = words[0];
		char[] harf = new char[len.length()];
		for (int i = 0; i < harf.length; i++) {
			harf[i] = len.charAt(i);
		}
		char[] star = new char[len.length()];
		for (int i = 0; i < star.length; i++) {
			star[i] = '*';
		}
		char user;

		while (true) {
			System.out.println("Enter a letter in the word " + Arrays.toString(star));
			user = input.next().charAt(0);
			boolean contrl = false;
			for (int i = 0; i < star.length; i++) {
				if (harf[i] == user) {
					if (star[i] == user) {
						System.out.println(user + " already in the word");
					}
					star[i] = user;
					contrl = true;
				}
			}
			if (contrl == false) {
				System.out.println(user + " is not in the word");
			}
			int countStar=0;
		for (int i = 0; i < star.length; i++) {
			if(star[i]=='*'){
				countStar++;
				if(countStar==0){
					System.out.println("Do you want to guess another word?");
				}
			}
		}}
	}

}
