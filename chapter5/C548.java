package chapter5;

import java.util.Scanner;

public class C548 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a string :");
	String a =input.nextLine();
	String output ="";
	System.out.println(a.length());
	for(int i=0;i<a.length();i+=2){
		
		output+=a.charAt(i);
	}
	System.out.println(output);
}
}
