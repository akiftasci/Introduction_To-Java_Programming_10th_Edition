package chapter6;

import java.util.Scanner;

public class C625 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter milliseconds: ");
	long millis = input.nextLong();
	System.out.println(convertMillis(millis));
	
}
public static String convertMillis(long millis){
	//int hours=0,minutes=0,seconds=0;
	//String time="00:00:00",stringHours,stringMinutes,StringSeconds;
	millis=millis/1000;
	//time=stringHours:stringMinutes:StringSeconds;
	//time+=seconds;
	String currentMinuteAndSecond = "";
	for (int i = 0; i < 2; i++) {
		currentMinuteAndSecond = ":" + millis % 60 + currentMinuteAndSecond;
		millis /= 60;
	}
	return millis + currentMinuteAndSecond;
}
}
