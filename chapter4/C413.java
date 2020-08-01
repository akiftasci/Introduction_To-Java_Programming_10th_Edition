package chapter4;

import java.util.Scanner;

public class C413 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char c =input.next().charAt(0);
		switch(Character.toLowerCase(c)){
		case 'a':
		case 'e':
		case 'i':
		case 'ý':
		case 'o':
		case 'ö':
		case 'u':
		case 'ü':
		System.out.println(c+" is a vowel");break;
		default: System.out.println(c+" is a consonant");break;
		}
		
}
}