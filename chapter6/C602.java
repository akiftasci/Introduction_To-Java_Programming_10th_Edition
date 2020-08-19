package chapter6;

import java.util.Scanner;

public class C602 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int no =input.nextInt();
	System.out.println("The addition of all the digits are :"+sumDigits(no));
}
public static int sumDigits(int n){
	int temp = n;
	int addition=0,extra;
	while(temp>10){
		extra=temp%10;
		addition=addition+extra;
		temp=temp/10;
	}
	addition=addition+temp;
	return addition;
}
}
