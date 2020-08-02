package chapter4;

import java.util.Scanner;

public class C421 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a SSN: ");
	String number =input.nextLine();
	String three = number.substring(0,3);
	String two = number.substring(4,6);
	String four = number.substring(7,11);
	
	if( three.length()<3 || three.length()>3){
		System.out.println("Error");
	}
	else if( two.length()<2 || two.length()>2){
		System.out.println("Error");
	}
	else if( four.length()<4 || four.length()>4){
		System.out.println("Error");
	}
	else{
		System.out.println("Correct");
	}
	System.out.println(three+two+four);
}
}
