package chapter4;

import java.util.Scanner;

public class C418 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter two characters: ");
	char major = input.next().charAt(0);
	char year = input.next().charAt(1);
	int a = (int)year;
	if( a==1){
		System.out.print("Your are a freshman in ");
	}
	else if (a==2){
		System.out.print("You are a sophomore in ");
	}
	else if (a==3){
		System.out.print("You are a junior in ");
	}
	else if (a==4){
		System.out.print("You are a senior in ");
	}
	switch(major){
	case 'M': System.out.println("Mathematics");break;
	case 'C': System.out.println("Computer Science");break;
	case 'I': System.out.println("Information Technology");break;
	
	default : System.out.println("Invalid input");break;
	}
	
	
}
}
