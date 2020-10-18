package chapter12.C1201;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberFormatException {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int i1 = (int)(Math.random()*10);
	int i2= (int)(Math.random()*10);
	int ans = i1+i2;
	
	System.out.println("What is "+i1+" + "+i2+" =?");
	try{
		int user =input.nextInt();
		if(user ==ans){
			System.out.println("correct answer");
		}}
		catch(InputMismatchException ex) {
			System.out.println("Wrong input");
			
		}
	}
}

