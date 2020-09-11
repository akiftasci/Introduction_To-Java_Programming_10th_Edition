package chapter7;

import java.util.Scanner;

public class C733 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Enter a year: ");
	int year = input.nextInt();
	int mod = year%12;
	String[] china= {"monkey","rooster","dog","pig","rat","ox","tiger","rabbit"
			,"dragon","snake","horse","sheep"};
	System.out.println(china[mod]);
	
}
}
