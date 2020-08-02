package chapter4;

import java.util.Scanner;

public class C422 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter string s1: ");
		String string1 = input.nextLine();
		System.out.print("Enter string s2: ");
		String string2 = input.nextLine();

		boolean substr = (string1.contains(string2));
			
		if (substr){
			System.out.println("contains");
			
		}
		else{
			System.out.println("Doesn not contains");
		}
		
			
		
		
	}
}
