package chapter5;

import java.util.Scanner;

public class C501 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int inp= -1;
	int sum=0,positive=0,negative=0;
	
	while (inp !=0){
		System.out.println("Enter an integer, the input ends if it is 0: ");
		inp = input.nextInt();
		if (inp == 0){
			System.out.println("The number of positives is : "+positive);
			System.out.println("The number of negatives is : "+negative);
			System.out.println("The total is :"+sum);
			System.out.println("The average is: "+(double)(sum/(positive+negative)));
			
		}
		else if(inp >0){
			positive++;
			sum=sum+inp;
			
		}
		else if(inp<0){
			negative++;
			sum=sum+inp;
			
		}
	}
}
}
