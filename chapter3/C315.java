package chapter3;

import java.util.Scanner;

public class C315 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double random = Math.random();
		System.out.println("random:"+random);
		if (random<0.1){
			random+=0.1;
		}
		int lottery = (int) (random * 1000);
		
		System.out.println("number is:" + lottery);
		int guess = scan.nextInt();

		int remain;
		remain = lottery;
		int d1 = remain % 10;
		remain = remain / 10;
		int d2 = remain % 10;
		int d3 = remain/10;
		
		

		int remain2;
		remain2 = guess;
		int gd1 = remain2 % 10;
		remain2 = remain2 / 10;
		int gd2 = remain2 % 10;
		int gd3 = remain2 / 10;
		
		System.out.println(" "+d1 +" "+ d2 +" "+ d3);
		
		if (guess == lottery) {
			System.out.println("You win $10,000!");
		} 
		
		else if (d1 == gd1 || d1 == gd2 || d1 == gd3) {
			if (d2 == gd1 || d2 == gd2 || d2 == gd3) {
				if (d3 == gd1 || d3 == gd2 || d3 == gd3) {
					System.out.println("You win $3,000!");
				}
			}

		} 

		else if (d1 == gd1 || d1 == gd2 || d1 == gd3 || d2 == gd1 || d2 == gd2 || d2 == gd3 || d3 == gd1 || d3 == gd2
				|| d3 == gd3) {
			System.out.println("You win $1,000!");

		} else {
			System.out.println("Try again...");
		}
		System.out.println(gd1+" "+ gd2+" "+gd3);
	}

}
