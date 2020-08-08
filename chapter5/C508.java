package chapter5;

import java.util.Scanner;

public class C508 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		int highestGrade=0;
		String highestName=" ";
		int no=input.nextInt();
		System.out.println("Enter the name and score: ");
		
		for(int i=0; i<no;no--){
			String name =input.next();
			int grade = input.nextInt();
			if (grade>highestGrade){
				highestGrade = grade;
				highestName = name;
			}
			
		}
		System.out.println("Highest grade is: "+ highestGrade+ " and the student is: "+ highestName);
	}

}
