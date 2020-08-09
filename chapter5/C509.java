package chapter5;

import java.util.Scanner;

public class C509 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		int highestGrade=0;
		String highestName=" ";
		int highestGrade2=0;
		String highestName2=" ";
		int no=input.nextInt();
		System.out.println("Enter the name and score: ");
		
		for(int i=0; i<no;no--){
			String name =input.next();
			int grade = input.nextInt();
			if (grade>highestGrade ){
				highestGrade2 =highestGrade;
				highestName2 = highestName;
				
				highestGrade = grade;
				highestName = name;
				
			}
			else if(grade > highestGrade2)
			{
				highestGrade2 = grade;
			highestName2 = name;
			
				
			}
			
		}
		System.out.println("Highest grade is: "+ highestGrade+ " and the student is: "+ highestName);
		System.out.println("Highest 2. grade is: "+ highestGrade2+ " and the student is: "+ highestName2);

	}
}
