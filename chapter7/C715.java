package chapter7;

import java.util.Scanner;

public class C715 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter ten numbers: ");
	int [] array = new int [10];
	int num;
	for (int i = 0; i < 10; i++) {
		num=input.nextInt();
		array[i]=num;
	}
	eliminateDuplicates(array);
}
public static int[] eliminateDuplicates(int[] list){
	int [] total = null;
	int temp;
	for (int j = 0; j < list.length-1; j++) {
		for (int i = 0; i < list.length-j-1; i++) {
			if ( list[i] >  list[i + 1]) {
				temp = list[i];
				list[i] = list[i + 1];
				list[i + 1] = temp;
			}
		}
	}


		for (int i = 0; i < list.length; i++) {
			for (int j = i+1; j < list.length; j++) {
				if(list[i]==list[j]){
					total=delete(list,i,j);
					
				}
			}
		}
	return total;
}
private static int[] delete(int[] list, int i, int j) {
	int[] newArr = new int[list.length-1];
	for (int k = 0; k < newArr.length; k++) {
		if(k==j){
			k--;
			continue;
		}
		newArr[k]=list[k];
	}
return newArr;}
}
