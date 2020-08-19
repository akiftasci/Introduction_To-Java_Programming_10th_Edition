package chapter6;

import java.util.Scanner;



public class C604 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int no=input.nextInt();
		System.out.println("The reverse is: ");
		reverse(no);
	}
	public static void reverse(int number){
		int reverse=0;
		while(number !=0){
			int digit = number%10;
			reverse = reverse*10+digit;
			number=number/10;
			
		}
		System.out.println(reverse);
		
	}
}
