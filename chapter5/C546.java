package chapter5;

import java.util.Scanner;

public class C546 {
	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		System.out.println("Enter a string:");
		String inp = input.nextLine();
		String reverse="";
		char ch;
		int le = inp.length();
		for(int i=inp.length()-1;i>=0;i--){
			ch =inp.charAt(i);
			reverse=reverse+ ch;
		}
		
		System.out.println("The reversed string is :"+reverse);
	}

}
