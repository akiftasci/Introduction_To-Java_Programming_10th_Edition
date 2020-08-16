package chapter5;

import java.util.Scanner;

public class C551 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first string: ");
	String first = input.nextLine();
	System.out.println("Enter the second string: ");
	String second = input.nextLine();
	String temp="";
	for(int i=0;i<first.length();i++){
		if(first.charAt(i)==second.charAt(i)){
			temp=temp+first.charAt(i);
		}
	}
	System.out.println("The common prefix is :"+temp);
}
}

