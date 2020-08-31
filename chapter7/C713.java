package chapter7;

import java.util.Scanner;

public class C713 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number between 1-54 that you want to exclude: (Enter 0 when done) ");
		int num=0,i=0;
		int [] exclude = new int[54];
		while(num!=0){
			num= input.nextInt();
			exclude[i]=num;
			i++;
			int random = getRandom(exclude);
			System.out.println("Random number is: "+random);
		}
		
		
	}
	

	public static int getRandom(int... numbers){
		int randomNumber =(int)(Math.random()*54+1);
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]==randomNumber){
				randomNumber =(int)(Math.random()*54+1);
				i--;
			}
		}
	return randomNumber;
	}
}
