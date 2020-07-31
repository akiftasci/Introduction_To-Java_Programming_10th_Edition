package chapter4;

import java.util.Scanner;

public class C411 {
public static void main(String[] args) {
	System.out.println("Enter a decimal value (0 to 15)");
	Scanner input = new Scanner(System.in);
	
	int value = input.nextInt();
	
	if(value<10){
		System.out.println("The hex value is:"+value);
		
	}
	else if( value>10 ){
		switch(value){
		case(10):System.out.println("The hex value is: A");break;
		case(11):System.out.println("The hex value is: B");break;
		case(12):System.out.println("The hex value is: C");break;
		case(13):System.out.println("The hex value is: D");break;
		case(14):System.out.println("The hex value is: E");break;
		case(15):System.out.println("The hex value is: F");break;
		
		}
	}
	else {
		System.out.println("Enter a value between 1-15");
	}
}
}
