package chapter5;

import java.util.Scanner;

public class C507 {
 public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double interest= 0.05;
	double faiz=0;
	double total=100000;
	for(int i=0;i<10;i++){
		
	
	faiz =total*interest;
	total = total +faiz;

	}
	System.out.printf("Total: %4.2f",total);
	}
}
