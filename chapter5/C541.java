package chapter5;

import java.util.Scanner;

public class C541 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int max=0,count=0;
	System.out.println("Enter numbers(0 to finish): ");
	int first=input.nextInt();
	
	while(first!=0 ){
		
		
		if(first>max ){
			max=first;
			count=1;
			
		}
		else if(first==max){
			count++;
		}
		first = input.nextInt();
	}
	System.out.println("max is: "+max+" and the occurance is:"+count);
}
}
