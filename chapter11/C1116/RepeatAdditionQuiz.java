package chapter11.C1116;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAdditionQuiz {
	public static void main(String[] args) {
		ArrayList<Integer> answer = new ArrayList<>();
		Scanner input= new Scanner(System.in);
		int i1=(int)(Math.random()*10);
		int i2=(int)(Math.random()*10);
		int addition=i1+i2;
		System.out.println("What is "+i1+" + "+i2+"?");
		int user = input.nextInt();
		answer.add(user);
		int count = 0;
		while (addition != user && count < 3) {
			System.out.println("Wrong");
			System.out.println(i1 + " + " + i2 + " = ?");
			user = input.nextInt();
			if (answer.contains(user)) {
				System.out.println("You already entered " + user);
			}
			answer.add(user);
			count++;
		}
		if (count < 3) {
			System.out.println("Correct");
		} else {
			System.out.println("Too many wrong tries");
		}
	}
	}

