package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestion_ShuffleArray {
public static void main(String[] args) {
	int [] arr = new int[6];
	for (int i = 0; i < arr.length; i++) {
		arr[i]=(int)((Math.random()*9)+1);
	}
	System.out.println(Arrays.toString(arr));
	Scanner input = new Scanner(System.in);
	System.out.println("Enter n:");
	int n= input.nextInt();
	int [] even = new int[(arr.length/2)];
	int [] odd = new int[(arr.length/2)];
	int j=0,k=0;
	for (int i = 0; i < arr.length/2; i++) {
		even[j]=arr[i];
		j++;
	}
	for (int i =arr.length/2 ; i < arr.length; i++) {
		odd[k]=arr[i];
		k++;
	}
	int y=0;
	for (int i = 0; i < arr.length/2; i++) {
		arr[y]=even[i];
		arr[y+1]=odd[i];
		y+=2;
				
	}
	System.out.println(Arrays.toString(arr));
}
}
