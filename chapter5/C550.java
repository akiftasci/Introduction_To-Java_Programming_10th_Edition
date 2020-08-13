package chapter5;

import java.util.Scanner;

public class C550 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a string: ");
	String a = input.nextLine();
	char output;
	int uppercase=0;
	for(int i=0;i<a.length();i++){
		if ((int)a.charAt(i)>65&&  (int)a.charAt(i)<90){
			uppercase++;
		}
		
	}
	System.out.println("The number of uppercase letters is "+uppercase);
}
}
