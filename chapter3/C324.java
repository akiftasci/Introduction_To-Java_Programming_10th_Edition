package chapter3;

import java.util.Scanner;

public class C324 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int rank = (int)((Math.random()*13)+1);
	switch(rank){
	case 1:System.out.print("The card you picked is Ace of ");break;
	case 2:System.out.print("The card you picked is two of ");break;
	case 3:System.out.print("The card you picked is three of ");break;
	case 4:System.out.print("The card you picked is four of ");break;
	case 5:System.out.print("The card you picked is five of ");break;
	case 6:System.out.print("The card you picked is six of ");break;
	case 7:System.out.print("The card you picked is seven of ");break;
	case 8:System.out.print("The card you picked is eight of ");break;
	case 9:System.out.print("The card you picked is nine of ");break;
	case 10:System.out.print("The card you picked is ten of ");break;
	case 11:System.out.print("The card you picked is Jack of ");break;
	case 12:System.out.print("The card you picked is Queen of ");break;
	case 13:System.out.print("The card you picked is King of ");break;
	
	}
	int suit = (int)(Math.random()*3);
	switch(suit){
		case 0:System.out.println("Clubs");break;
		case 1:System.out.println("Diamonds");break;
		case 2:System.out.println("Hearts");break;
		case 3:System.out.println("Spades");break;
		
	}
}
}
