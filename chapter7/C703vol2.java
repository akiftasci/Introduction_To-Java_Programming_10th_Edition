package chapter7;

import java.util.Scanner;

public class C703vol2 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the integers between 1 and 100:");
	int [] arr = new int[100];
	int no;
	while((no=input.nextInt())!=0){
		arr[no-1]++;
	}
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]>0){
			System.out.println((i+1)+" occured "+ arr[i]+" time"+(arr[i]>1?"s":""));
		}
	}
}
}
