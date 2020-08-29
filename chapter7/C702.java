package chapter7;

import java.util.Scanner;

public class C702 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter 10 integers: ");
	int [] dizi = new int [10];
	for(int i=0;i<10;i++){
		int num = input.nextInt();
		dizi[i]=num;
	}
	for(int j=9;j>=0;j--){
		System.out.print(dizi[j] + " ");
	}
}
}
