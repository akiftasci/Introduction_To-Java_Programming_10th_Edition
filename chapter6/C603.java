package chapter6;

import java.util.Scanner;

public class C603 {public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int no=input.nextInt();
	System.out.println("The reverse is: "+ reverse(no));
	System.out.println("The number is palindrome "+isPalindrome(no));
}
public static int reverse(int number){
	int reverse=0;
	while(number !=0){
		int digit = number%10;
		reverse = reverse*10+digit;
		number=number/10;
		
	}
	return reverse;
	
}
public static boolean isPalindrome(int number){
	
	if(number== reverse(number)){
		return true;
	}
	else 
		return false;
}
}
