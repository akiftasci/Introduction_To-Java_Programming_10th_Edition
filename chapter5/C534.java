package chapter5;

import java.util.Scanner;

public class C534 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int countPlayer=0, countComputer=0;
		while(countPlayer-countComputer!=2 || countComputer-countPlayer!=2){
		System.out.println("scissor (0), rocks (1), paper(2): ");
		int input = scan.nextInt();

		int guess = (int) ((Math.random() * 10) % 3);

		System.out.println("The computer is ");
		switch (guess) {
		case 0:
			System.out.println("scissors");
			break;
		case 1:
			System.out.println("rock");
			break;
		case 2:
			System.out.println("paper");
			break;

		}
		System.out.println("Your guess is ");
		switch (input) {
		case 0:
			System.out.println("scissors");
			break;
		case 1:
			System.out.println("rock");
			break;
		case 2:
			System.out.println("paper");
			break;

		}
		if ( guess == input){
			System.out.println("it's a draw try again ");
		}
		else if ((input == 0 && guess ==2) || (input ==1 && guess==0) || (input ==2 && guess==1)){
			System.out.println("You win!");
			countPlayer++;
			
		}
		else {
			System.out.println("You lose");
			countComputer++;
		}
		if(countPlayer-countComputer==2 || countComputer-countPlayer==2)
			break;
		
	}
		if(countPlayer>countComputer){
			System.out.println("You win the serie!!!!");
		}
		else System.out.println("You lose the serie!!");
}}
