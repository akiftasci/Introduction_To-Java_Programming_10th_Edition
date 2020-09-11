package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class C732 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter list: ");
		int len=input.nextInt();
		int [] arr = new int [len];
		int temp;
		for (int i = 0; i < arr.length; i++) {
			temp=input.nextInt();
			arr[i]=temp;
		}
		
		System.out.println(Arrays.toString(partition(arr)));
	}

	public static int[] partition (int [] list){
		int pivot= list[0];
		int [] temp = new int[list.length];
		int no=0;
		int last=list.length-1;
		for (int i = 0; i < list.length; i++) {
			if(list[i]<pivot){
				temp[no]=list[i];
				no++;
			}
			if(list[i]>pivot){
				temp[last]=list[i];
				last--;
			}
		
	}
		temp[no]=pivot;
		
	return temp;}
}
