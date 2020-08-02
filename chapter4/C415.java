package chapter4;

import java.util.Scanner;

public class C415 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a letter: ");
	char letter = input.next().charAt(0);
//	if (Character.toUpperCase(letter)=='A' || Character.toUpperCase(letter)== 'B'|| Character.toUpperCase(letter)=='C'){}

	int asci = (int)(Character.toUpperCase(letter));
	
	if(65>=asci && asci <68){
		System.out.println("1");
		}
	else if(68>=asci && asci <71){
		System.out.println("2");
		}
	else if(71>=asci && asci <74){
		System.out.println("3");
		}
	else if(74>=asci && asci <77){
		System.out.println("4");
		}
	else if(77>=asci && asci <80){
		System.out.println("5");
		}
	else if(80>=asci && asci <83){
		System.out.println("6");
		}
	else if(83>=asci && asci <86){
		System.out.println("7");
		}
	else if(86>=asci && asci <89){
		System.out.println("8");
		}
	else if(89>=asci && asci <92){
		System.out.println("9");
		}
	else{
		System.out.println("Invalid input");
	}
}
}
