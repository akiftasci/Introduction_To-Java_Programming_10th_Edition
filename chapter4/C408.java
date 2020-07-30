package chapter4;

import java.util.Scanner;

public class C408 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter an ASCII code: ");
	int a= input.nextInt();
	char b = (char)a;
	System.out.println(	"The character for ASCII code "+a+" is "+b);
}
}
