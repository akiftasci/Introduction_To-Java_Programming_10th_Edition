package chapter6;

import java.util.Scanner;

public class C631 {
public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
	System.out.println("Enter a credit card number as a long integer: ");
	long cardNumber = input.nextLong();
	System.out.println(isValid(cardNumber));
	
}
public static boolean isValid(long number){
	if(prefixMatched(number)==true){
		return true;
	}
	else{
	return false;
	}
	
}
public static int sumOfDoubleEvenPlace(long number){
	String stringNumber = Long.toString(number);
	int sum=0, control,temp;
	for(int i=0;i<stringNumber.length();i+=2){
		control=Character.getNumericValue(stringNumber.charAt(i));
		control=2*control;
		if(control>=10){
			temp=control%10;
			control=control/10;
			control=control+temp;
		}
		
			sum=sum+control;
		
	}
	return sum;
	
}

public static int sumOfOddPlace(long number){

	String stringNumber = Long.toString(number);
	int sum2=0, control2,temp2;
	for(int i=1;i<stringNumber.length();i+=2){
		control2=Character.getNumericValue(stringNumber.charAt(i));
			sum2=sum2+control2;
		
	}
	return sum2;

	
}
public static boolean prefixMatched(long number){
	if((sumOfDoubleEvenPlace(number)+sumOfOddPlace(number))%10==0){
		return true;
		
	}
	else{
		return false;
	}
	
	
}

}
