package chapter3;

import java.util.Scanner;

public class C310 {
public static void main(String[] args) {
	int a = (int)(Math.random()*100);

	int b = (int)(Math.random()*100);
	int addition = a+b;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("what is : " +a+"+ "+b+" =");
	
	int answer =scan.nextInt();
	if (answer == addition){
		System.out.println("Correct!");
	}
	else {
		System.out.println("Wrong the answer is: "+addition);
	}
}


}
