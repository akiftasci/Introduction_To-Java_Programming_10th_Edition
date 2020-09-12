package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestion_StringComparising {
	public static void main(String[] args) {
		char[] arr = new char[0];
		System.out.println("Enter array:");
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		int[] letters = new int[26];
		for (int i = 0; i < a.length(); i++) {
			letters[a.charAt(i) - 'a']++;
		}
		char[] temp = new char[a.length()];
		int j = 0;
		for (int i = 0; i < a.length(); i++) {
			if (letters[i] > 0) {
				temp[j] = (char) (i + 'a');
				j++;
			}
		}
		int [] no = new int[10];
		int k=0;
		for (int i = 0; i < temp.length; i++) {
			if(letters[i]>0){
				no[k]=letters[i];
				k++;
			}
		}
		for (int i = 0; i < temp.length; i++) {
			if(letters[i]==0){
				//System.exit(0);
			}
			System.out.print(temp[i]+""+letters[i]);
		}
		
	}
}
