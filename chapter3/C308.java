package chapter3;

import java.util.Scanner;

public class C308 { 
	public static void main(String[] args) {
	System.out.println("Enter three integers: ");
	Scanner input = new Scanner(System.in);
	
	int a =input.nextInt();
	int b =input.nextInt();
	int c =input.nextInt();
	
	if (a<b && a<c){
		if(b<c){
			System.out.println(a+" "+b +" "+c);
		}
		else{
			System.out.println(a+" "+c+" "+b);
		}
	}
	
	else if (b<a && b<c){
		if(a<c){
			System.out.println(b+" "+a+" "+ c);
			
		}
		else{
			System.out.println(b+" "+c+" "+ a);
		}
		
	}
	if (c<a && c<b){
		if(b<a){
			System.out.println(c+" "+b+" "+ a);
			
		}
		else{
System.out.println(c+" "+a+" "+ b);

		}
		
	}
	
}

}
