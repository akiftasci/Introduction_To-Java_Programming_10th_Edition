package chapter3;

import java.util.Scanner;

public class C305 {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter today's day: ");
	
	int day = scan.nextInt();
	System.out.println("Enter the number of days elapsed since today: ");
	int elapse = scan.nextInt();
	int futureDay = (day + elapse) % 7;
	System.out.print("Today is ");
	switch (day){
	case 0:System.out.println("Sunday");break;
	case 1:System.out.println("Monday");break;
	case 2:System.out.println("Tuesday");break;
	case 3:System.out.println("Wednesday");break;
	case 4:System.out.println("Thursday");break;
	case 5:System.out.println("Friday");break;
	case 6:System.out.println("Saturday");break;
	}
	System.out.print(" and the future day is ");
	switch (futureDay)
	{
		case 0: System.out.println("Sunday"); break;
		case 1: System.out.println("Monday"); break;
		case 2: System.out.println("Tuesday"); break;
		case 3: System.out.println("Wednesday"); break;
		case 4: System.out.println("Thursday"); break;
		case 5: System.out.println("Friday"); break;
		case 6: System.out.println("Saturday");
	}
}
}
