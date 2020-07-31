package chapter4;

import java.util.Scanner;

public class C412 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a hex digit: ");
	char value = input.next().charAt(0);
	switch(value){
	case('A'):System.out.println("The binary value is 1010");break;
	case('B'):System.out.println("The binary value is 1011");break;
	case('C'):System.out.println("The binary value is 1100");break;
	case('D'):System.out.println("The binary value is 1101");break;
	case('E'):System.out.println("The binary value is 1110");break;
	case('F'):System.out.println("The binary value is 1111");break;
	
	}
	if((int)value>70){
		System.out.println("Invalid input");
	}
}
}
