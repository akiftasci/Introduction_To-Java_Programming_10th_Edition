package chapter3;

import java.util.Scanner;

public class C314 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Make a guess 0 or 1:");
		int a= (int)((Math.random()*10)%2);
		int b=scan.nextInt();
		if ( a == b){
			System.out.println("Your guess is corret! Jackpoint!");
			
		}
		else{
			System.out.println("Your guess is wrong...");
		}
	}

}
