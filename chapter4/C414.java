package chapter4;

import java.util.Scanner;

public class C414 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a letter grade: ");
		char letter = input.next().charAt(0);
		switch(Character.toUpperCase(letter)){
		case 'A': System.out.println("The numeric value for grade "+letter+" is 4");break;
		case 'B': System.out.println("The numeric value for grade "+letter+" is 3");break;
		case 'C': System.out.println("The numeric value for grade "+letter+" is 2");break;
		case 'D': System.out.println("The numeric value for grade "+letter+" is 1");break;
		default : System.out.println("Input is invalid");break;
		}
		
	}

}
