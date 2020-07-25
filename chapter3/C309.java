package chapter3;

import java.util.Scanner;

public class C309 {
	public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	System.out.println("Enter the first 9 digits of an ISBN as integer: ");
	
	int number =input.nextInt();
	int remain;
	//013601267
	int d1 = number/100000000;
	
	remain = number/10000000;
	int d2 = remain%10;
	
	remain = number/1000000;
	int d3 = remain%10;
	
	remain = number/100000;
	int d4 = remain%10;
	
	remain = number/10000;
	int d5 = remain%10;
	
	remain = number/1000;
	int d6 = remain%10;
	
	remain = number/100;
	int d7 = remain%10;
	
	remain = number/10;
	int d8 = remain%10;
	
	remain = number;
	int d9 = remain%10;
	
	int d10= (d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
	System.out.print("digits "+d1+d2+d3+d4+d5+d6+d7+d8+d9);
	
	if (d10==10){
		System.out.print("X");
		
		
	}
	else {System.out.print(d10);
		
	}

	
}

}
