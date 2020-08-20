package chapter6;

import java.util.Scanner;

public class C620 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String inp =input.nextLine();
		System.out.println("The number of letters is:"+countLetters(inp));
	}
	public static int countLetters(String s){
		int count=0;
		String kelime = s.toLowerCase();
		
		for(int i=0;i<kelime.length();i++){
			//if(kelime.charAt(i)>=97&&kelime.charAt(i)<=122 ||kelime.charAt(i)==231 ||kelime.charAt(i)==305 ||kelime.charAt(i)==287 ||kelime.charAt(i)==246 ||kelime.charAt(i)==351 ||kelime.charAt(i)==252){
				if (Character.isLetter(s.charAt(i))){
				count++;
				
			}
		}
		return count;
	}

}
