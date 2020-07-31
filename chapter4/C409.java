package chapter4;

import java.util.Scanner;

public class C409 {
public static void main(String[] args) {
	System.out.println("Enter a character: ");
	Scanner input = new Scanner(System.in);
	char a= input.next().charAt(0);
	
	
	System.out.println("The unicode for "+a+"is"+(int)(a));
}
}
