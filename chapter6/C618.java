package chapter6;

import java.util.Scanner;

public class C618 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String pass = input.nextLine();
		passwordChecker(pass);

	}

	public static void passwordChecker(String pass) {
		int count = 0;
		if (pass.length() < 8) {
			System.out.println("Your password must be at least 8 characters");
		}
		for (int i = 0; i < pass.length(); i++) {
			int deger= (int)pass.charAt(i);
			if(((int) pass.charAt(i) < 48 || (int) pass.charAt(i) > 57) &&((int) pass.charAt(i) < 65 ||(int) pass.charAt(i) > 90) &&((int) pass.charAt(i) < 97 || (int) pass.charAt(i) > 122)){
				System.out.println("Your password must containt only letters and digits");
				break;
			}
			

			if ((int) pass.charAt(i) >= 48 && (int) pass.charAt(i) <= 57) {
				count++;
			}
		}
		if (count < 2) {
			System.out.println("Your password must have two digits");
		}
		
		else{
			System.out.println("Valid password");
		}
	}
}
