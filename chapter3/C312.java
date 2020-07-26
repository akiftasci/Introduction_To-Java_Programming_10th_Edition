package chapter3;

import java.util.Scanner;

public class C312 {

	public static void main(String[] args) {
		System.out.println("Enter a three-digit integer: ");
		
		Scanner scan =new Scanner(System.in);
		int number = scan.nextInt();
		int remain=number;
		// 656 d3=6 d2=5 d3=6
		int d3 = remain%10;
		remain = remain/10;
		int d2 = remain%10;
		remain = remain/10;
		int d1 = remain%10;
		
		if (d3==d1){
			System.out.println(number+ " is a palindrome");
			
		}
		else {
			System.out.println(number + "is not a palindrome");
		}
		
		
	}

}
