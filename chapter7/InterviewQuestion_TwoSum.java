package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestion_TwoSum {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter numbers: ");
	int[] arr = new int[4];
	for (int i = 0; i < arr.length; i++) {
		int no = input.nextInt();
		arr[i]=no;
	}
	System.out.println("Enter target:");
	int target = input.nextInt();
	twoSum(arr,target);
}

private static void twoSum(int[] arr, int target) {
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i] + arr[j]==target){
				System.out.println(Arrays.toString(arr));
				System.out.println(i+ " "+j);
			}
		}
	}
}
}
