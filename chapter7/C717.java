package chapter7;

import java.util.Scanner;

public class C717 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number of studens: ");
	int no = input.nextInt();
	int [] scores = new int [no];
	System.out.println("Enter the names: ");
	String name;
	String [] names = new String [no];
	for (int i = 0; i < names.length; i++) {
		name  = input.next();
		names[i]= name;
	}
	
	
	System.out.println("Enter the scores of students in order:");
	int grades;
	for (int i = 0; i < scores.length; i++) {
		grades =input.nextInt();
		scores[i]=grades;
	}
	
sortGradesIncreasing(scores, names);
}

public static void sortGradesIncreasing(int[] scores, String[] names) {
	for (int i = 0; i < scores.length-1; i++) {
		for (int j = 0; j < scores.length-i-1; j++) {
			if(scores[j]>scores[j+1]){
				int temp = scores[j];
				scores[j]=scores[j+1];
				scores[j+1]=temp;
			
				String temp2 = names[j];
				names[j]=names[j+1];
				names[j+1]=temp2;
			}
		}
	}
	for (int i = 0; i < names.length; i++) {
		System.out.println(names[i]+" score is:"+scores[i]);
	}
	
}
}
