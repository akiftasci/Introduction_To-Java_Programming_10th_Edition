package chapter6;

import java.util.Scanner;

public class C637 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = input.nextInt();
		System.out.println("Enter the width: ");
		int width = input.nextInt();
		System.out.println(format(number,width));
		
	}

	public static String format(int number, int width){
		String newFormat =number +"";
		if(newFormat.length()<width){
			for(int i=width-newFormat.length();i>0;i--){
				newFormat=0+newFormat;
			}
		}
		return newFormat;
	}
}
