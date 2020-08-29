package chapter7;

import java.util.Scanner;

public class C701 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students:" );
		int noStudent = input.nextInt();
		int [] students = new int [noStudent];
		System.out.println("Enter "+noStudent+" scores: ");
		for(int i=0;i<students.length;i++){
			int score = input.nextInt();
			students[i]=score;
			
		}
		int temp,max=0;
		for(int x=0;x<students.length-1;x++){
			if(students[x]<students[x+1]){
				max =students[x+1];
			}
		}
			
		
			for(int j=0;j<students.length;j++){
				if(students[j]>=max-10){
					System.out.println("Student "+j+" score is "+students[j]+" and the grade is A");
				}
				else if(students[j]>=max-20){
					System.out.println("Student "+j+" score is "+students[j]+" and the grade is B");

				}
				else if(students[j]>=max-30){
					System.out.println("Student "+j+" score is "+students[j]+" and the grade is C");

				}
				else if(students[j]>=max-40){
				System.out.println("Student "+j+" score is "+students[j]+" and the grade is D");
			}
			
				
			
			else {
				System.out.println("Student "+j+" score is "+students[j]+" and the grade is F");

			}}
		
		}
		
	}
	
