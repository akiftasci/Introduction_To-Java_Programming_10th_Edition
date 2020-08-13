package chapter5;

import java.util.Scanner;

public class C537 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an decimal integer: ");
		int decimal = input.nextInt();
		int binary, bolum=0;
		int elde;
		String sayi="";
		bolum=decimal;
		elde=decimal;
		while(elde>1.0){
		bolum = elde % 2;
		elde=elde/2;
		
		sayi=bolum+sayi;
		}
		System.out.println(elde+sayi);
	}
}
