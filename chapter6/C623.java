package chapter6;

import java.util.Scanner;

public class C623 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a string: ");
	String inp = input.nextLine();
	System.out.println("Enter the character: ");
	char a = input.next().charAt(0);
	System.out.println(a+" occurs "+count(inp,a)+" times");
}
public static int count(String str, char a){
	int count=0;
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)==a){
			count++;
		}
	}
	return count;
}
}
